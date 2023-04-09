#include "item.h"
#include <sstream>

Item::Item(std::string name, int price) {
    if (price < 0) {
        throw std::runtime_error("Price must be non-negative");
    }
    name_ = name;
    price_ = price;
}

std::string Item::to_string() const {
    std::ostringstream oss;
    oss << name_ << " ($" << price_ / 100 << "." << price_ % 100 << ")";
    return oss.str();
}

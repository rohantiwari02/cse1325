#include "item.h"
#include <sstream>



Item::Item(const std::string& name, int price) : _name(name), _price(price) {
    if (price < 0) {
        throw std::runtime_error("Price cannot be negative");
    }
}

std::ostream& operator<<(std::ostream& os, const Item& item) {
    os << item._name << " ($" << (item._price / 100) << ".";
    if (item._price % 100 < 10) {
        os << "0";
    }
    os << (item._price % 100) << ")";
    return os;
}

std::istream& operator>>(std::istream& is, Item& item) {
    std::getline(is >> std::ws, item._name);
    std::string price_str;
    std::getline(is >> std::ws, price_str);
    item._price = std::stoi(price_str);
    return is;
}

Item::Item() : Item("", 0) {
    
}

#include "vending_machine.h"
#include <iostream>
#include <sstream>

void Vending_machine::add(std::string name, int price) {
    Item item(name, price);
    items_.push_back(item);
}

void Vending_machine::buy(int index) {
    std::cout << "#### Buying " << items_[index].to_string() << std::endl;
}

std::string Vending_machine::menu() const {
    std::ostringstream oss;
    oss << "Menu:" << std::endl;
    for (int i = 0; i < items_.size(); i++) {
        oss << i << ": " << items_[i].to_string() << std::endl;
    }
    return oss.str();
}

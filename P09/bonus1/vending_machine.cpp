#include "vending_machine.h"
#include <iostream>
#include <sstream>

void Vending_machine::add(const Item& item) {
    _items.push_back(item);
}

void Vending_machine::buy(int index) {
    std::cout << "#### Buying " << _items[index] << std::endl;
    _items.erase(_items.begin() + index);
}

std::ostream& operator<<(std::ostream& os, const Vending_machine& machine) {
    os << "Vending Machine Menu:\n";
    for (size_t i = 0; i < machine._items.size(); i++) {
        os << i << ": " << machine._items[i] << std::endl;
    }
    return os;
}

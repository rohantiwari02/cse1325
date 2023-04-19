#ifndef VENDING_MACHINE_H
#define VENDING_MACHINE_H

#include <vector>
#include <string>
#include "item.h"

class Vending_machine {
private:
    std::vector<Item> _items;
public:
    Vending_machine();
    Vending_machine(std::istream& ist);
    Vending_machine& operator[](int index);
    void add(const Item& item);
    void buy(int index);
    friend std::ostream& operator<<(std::ostream& os, const Vending_machine& machine);
};

#endif // VENDING_MACHINE_H

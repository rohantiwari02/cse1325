#include <iostream>
#include "item.h"
#include "vending_machine.h"

int main() {
    Vending_machine machine;

    Item snickers("Snickers", 125);
    Item chips("Chips", 250);

    machine.add(snickers);
    machine.add(chips);

    std::cout << machine << std::endl;

    machine.buy(0);

    return 0;
}

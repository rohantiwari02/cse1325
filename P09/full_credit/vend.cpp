#include "vending_machine.h"
#include <iostream>

int main() {
    Vending_machine machine;
    machine.add("Snickers", 259);
    machine.add("Chips", 75);
    std::cout << machine.menu() << std::endl;
    machine.buy(0);
    return 0;
}

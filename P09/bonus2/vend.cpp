#include <iostream>
#include <fstream>
#include "item.h"
#include "vending_machine.h"

int main() {
    Vending_machine machine;
    std::ifstream ifs{"products.txt"};
    if (!ifs) {
        std::cerr << "Can't open input file\n";
        return 1;
    }
    while (ifs) {
        Item item;
        ifs >> item;
        machine.add(item, item.price());
    }
    std::cout << machine << std::endl;
    machine.buy(0); // Buy the first item in the list
    std::cout << machine << std::endl;
    return 0;
}

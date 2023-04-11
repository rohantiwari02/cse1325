#ifndef ITEM_H
#define ITEM_H

#include <string>
#include <stdexcept>

class Item {
private:
    std::string _name;
    int _price;
public:
    Item(const std::string& name = "", int price = 0);
    Item();
    friend std::ostream &operator<<(std::ostream &os, const Item &item);
    friend std::istream& operator>>(std::istream& is, Item& item);
};

#endif 

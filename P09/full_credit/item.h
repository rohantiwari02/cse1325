#ifndef ITEM_H
#define ITEM_H

#include <stdexcept>
#include <string>

class Item {
public:
    Item(std::string name, int price);

    std::string to_string() const;

private:
    std::string name_;
    int price_;
};

#endif

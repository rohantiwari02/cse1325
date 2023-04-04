#include <iostream>
#include <string>

int main(int argc, char* argv[]) {
    std::string prev_arg = "";
    for (int i = 1; i < argc; ++i) {
        std::string curr_arg = argv[i];
        if (curr_arg != prev_arg) {
            std::cout << curr_arg << " ";
            prev_arg = curr_arg;
        }
    }
    std::cout << std::endl;
    return 0;
}

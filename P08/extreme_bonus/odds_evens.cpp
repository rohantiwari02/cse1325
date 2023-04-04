#include <iostream>
#include <vector>

int main() {
  std::vector<int> v;
  int num;

  while (std::cin >> num) {
    v.push_back(num);
  }

  std::cout << "Number of elements: " << v.size() << std::endl;

  std::cout << "All elements: ";
  for (auto i : v) {
    std::cout << i << " ";
  }
  std::cout << std::endl;

  std::cout << "Elements at even indices: ";
  for (int i = 0; i < v.size(); i += 2) {
    std::cout << v[i] << " ";
  }
  std::cout << std::endl;

  std::cout << "Elements at odd indices: ";
  for (int i = 1; i < v.size(); i += 2) {
    std::cout << v[i] << " ";
  }
  std::cout << std::endl;

  return 0;
}

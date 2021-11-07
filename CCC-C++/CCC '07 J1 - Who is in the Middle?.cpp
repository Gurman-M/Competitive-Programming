#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
  vector<int> nums;
  int a, b, c;
  cin >> a >> b >> c;
  nums.push_back(a);
  nums.push_back(b);
  nums.push_back(c);
  std::sort(nums.begin(), nums.end());
  cout << nums[1] << "\n";
}

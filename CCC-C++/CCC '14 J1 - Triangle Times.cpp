#include <iostream>
#include <string>

using namespace std;

int main() {
  int t1, t2, t3;
  cin >> t1 >> t2 >> t3;

if (t1 + t2 + t3 == 180) {
  if (t1 == 60 && t2 == 60 && t3 == 60) {
    cout << "Equilateral\n";
  } else if (t1 == t2 || t2 == t3 || t1 == t3) {
    cout << "Isosceles\n";
  } else {
    cout << "Scalene\n";
    }
  } else {
  cout << "Error\n";
  }
} 


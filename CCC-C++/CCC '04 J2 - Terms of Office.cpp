#include <bits/stdc++.h>

using namespace std;

int main() {
  //mayor 4 
  //treasurer 2
  //programmer 3
  //dog 5

  int m = 4, t = 2, p = 3, d = 5;
  int year1, year2;
  cin >> year1 >> year2;
  for (int i = year1; i <= year2; i++) {
    if ((i-year1)%60 == 0) {
      cout << "All positions change in year " << i << "\n";
    }
  }


  return 0;
}

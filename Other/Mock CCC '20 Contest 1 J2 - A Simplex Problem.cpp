#include <iostream>

using namespace std;

int main() {
  int u1, u2, k;
  cin >> u1 >> u2 >> k;
  int large1;
  int small1;

  if (u1 > u2) {
    large1 = u1;
    small1 = u2;
  } else if (u2 > u1) {
    large1 = u2;
    small1 = u1;
  } else {
    large1 = u1;
    small1 = u2;
  }

  int max = ((large1*(k - 1) + (small1*1)));
  int check = 0;

  for (int i = 0; i <= k; i++) {
      check = (large1*(k - i)) + (small1*i);
      if (check > max) {
        max = check;
      }
    }
  

  cout << max << endl;

  
}

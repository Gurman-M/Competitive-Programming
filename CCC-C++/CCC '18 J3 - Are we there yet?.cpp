#include <iostream>
#include <queue>
#include <vector>
#include <array>
#include <math.h>
using namespace std;


int main() {

  int d1[4];
  int c1[5];

  int distance;

  for (int i = 0; i < 4; i++) {
    cin >> distance;
    d1[i] = distance;
  }
  
   
  for(int i = 0; i < 5; i++) {
    if (i == 0) {
      c1[0] = 0;
    } else {
    c1[i] = c1[i - 1] + d1[i - 1];
    }
  }


for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
      cout << abs(c1[i] - c1[j]) << " "; 
    }
      cout << "\n";
  }
}

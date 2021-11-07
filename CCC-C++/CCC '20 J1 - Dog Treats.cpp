#include <iostream>

using namespace std;

// 1 × S + 2 × M + 3 × L

int main() {
  
  int s, m, l;
  cin >> s >> m >> l;
  int score = ((1 * s) + (2 * m) + (3 * l));
  
  if (score >= 10) {
    cout << "happy\n";
  } else {
    cout << "sad\n";
  }
}

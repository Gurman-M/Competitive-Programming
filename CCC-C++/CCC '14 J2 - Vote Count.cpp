#include <bits/stdc++.h>
#include <iostream>
#include <string>

using namespace std;

int main() { 
    
    int num;
  cin >> num;
  string votes;
  cin >> votes;

  int a = 0;
  int b = 0;

  for (int i = 0; i < votes.length(); i++) {
    if (votes.at(i) == 'A') {
      a++;
    } else if (votes.at(i) == 'B') {
      b++;
    } 
  }

  if (a > b) {
    cout << "A" << endl;
  } else if (b > a) {
    cout << "B" << endl;
  } else {
    cout << "Tie" << endl;
  }

    return 0;
}

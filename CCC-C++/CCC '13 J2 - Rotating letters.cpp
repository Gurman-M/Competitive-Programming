#include <iostream>
#include <string>

  using namespace std;

int main() {
  string word = "";
  cin >> word;
  int length = word.size();
  bool tell = false;
//I, O, S, Z, H, X, N

  for (int i = 0; i < length; i++) {
    if (word.at(i) == 'I') {
      tell = false;
    } else if (word.at(i) == 'O') {
      tell = false;
    } else if (word.at(i) == 'S') {
      tell = false;
    } else if (word.at(i) == 'Z') {
      tell = false;
    } else if (word.at(i) == 'H') {
      tell = false;
    } else if (word.at(i) == 'X') {
      tell = false;
    } else if (word.at(i) == 'N') {
      tell = false;
    } else {
      tell = true;
    }
  }

  if (tell) {
    cout << "NO\n";
  } else {
    cout << "YES\n";
  }

}

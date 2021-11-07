#include <iostream>
#include <string>


using namespace std;

string shift(string text) {
  char first = text[0];
  for (int i = 0; i < text.size() - 1; i++) {
    text[i] = text[i + 1];
  }
  text[text.size() - 1] = first;
  return text;
}

int main() {

  string word, text;
  cin >> word >> text;
  
 for (int i = 0; i < word.size() - 1; i++) {
    if (word.find(text) < 1001) {
      cout << "yes\n";
      return 0;
    }
      text = shift(text);
  }
    
    cout << "no\n";
    return 0;
}

#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
  int x, y;
  string word, obj;
  cin >> x >> y;
  vector <string> words;
  vector <string> objects;

  //int sentences = x * y;
  for (int i = 0; i < x; i++) {
    cin >> word;
    words.push_back(word);
  }

  for (int i = 0; i < y; i++) {
    cin >> obj;
    objects.push_back(obj);
  }

  for (int i = 0; i < words.size(); i++) {
    for (int j = 0; j < objects.size(); j++) {
      cout << words[i] << " as " << objects[j] << "\n";
    }
  }

  return 0;

}

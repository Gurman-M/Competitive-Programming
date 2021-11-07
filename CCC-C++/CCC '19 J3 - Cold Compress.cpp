#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
  int n;
  string lines;
  cin >> n;

  vector <pair<int, char>> text;
  int counter = 0;
  int times = 0;
  char c;

  for (int i = 0; i < n; i++) {
    cin >> lines;
    for (int j = 0; j <= lines.size(); j++) {
      c = lines[counter];
      if (lines[j] != c) { 
         text.push_back(make_pair(times, c));
          counter = j;
          times = 1;
      } else {  
        times++;
      }
    }

    counter = 0;
    times = 0;
    for (int x = 0; x < text.size(); x++) {
    cout << text[x].first << " " << text[x].second << " ";
    }
    cout << "\n";
    text.clear();
  }
  
}

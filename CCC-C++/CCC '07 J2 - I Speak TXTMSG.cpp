#include <bits/stdc++.h> 

using namespace std;

int main() {
  string texts;
  unordered_map<string, string> map;
  //dictionary
  map["CU"] = "see you";
  map[":-)"] = "I'm happy";
  map[":-("] = "I'm unhappy";
  map[";-)"] = "wink";
  map[":-P"] = "stick out my tongue";
  map["(~.~)"] = "sleepy";
  map["TA"] = "totally awesome";
  map["CCC"] = "Canadian Computing Competition";
  map["CUZ"] = "because";
  map["TY"] = "thank-you";
  map["YW"] = "you're welcome";
  map["TTYL"] = "talk to you later";


  while (texts != "TTYL") {
    cin >> texts;
    if (map.find(texts) != map.end()) {
      cout << map[texts] << "\n";
    }
    else {
      cout << texts << "\n";
    }
  }

  return 0;

 }

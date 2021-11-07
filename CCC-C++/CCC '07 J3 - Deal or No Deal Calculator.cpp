#include <bits/stdc++.h>
using namespace std;

int main() {
  vector <int> num; 
  vector <int> vals;
  int v1 = 100;
  int v2 = 500;
  int v3 = 1000;
  int v4 = 5000;
  int v5 = 10000;
  int v6 = 25000;
  int v7 = 50000;
  int v8 = 100000;
  int v9 = 500000;
  int v10 = 1000000;
  
 
  num.push_back(v1);
  num.push_back(v2);
  num.push_back(v3);
  num.push_back(v4);
  num.push_back(v5);
  num.push_back(v6);
  num.push_back(v7);
  num.push_back(v8);
  num.push_back(v9);
  num.push_back(v10);

  int cases = 0;
  double count = 0;
  while (cases < 10) {
    cin >> cases;
    if (cases > 10) {
      break;
    }
    num[cases-1] = 0;
  } 

  for (int i = 0; i < num.size(); i++) {
    if (num[i] != 0) {
   vals.push_back(num[i]);
     count += vals[i];
    }
  }

  
  cout << count << endl;
  
  count = count/num.size();
  if (count < cases) {
    cout << "deal\n";
  } else {
    cout << "no deal\n";
  }

  cout << count << endl;

  
}

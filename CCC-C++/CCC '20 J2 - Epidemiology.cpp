#include <iostream>

using namespace std;

int main() {
  int p, n , r;
  cin >> p >> n >> r;
  int count = n;
  int days = 0;
 
  
  while (count <= p) {
    n = n*r;
    cout << n << endl;
    days++;
    count += n;
    }
    
    cout << days << "\n";
  } 
  

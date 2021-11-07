#include <iostream>

using namespace std;

int main() {
  int input;
  int array[4];
  for (int i = 0; i < 4; i++) {
    cin >> input;
    array[i] = input;
  }
  
  int small = array[0];
  int large = array[0];
  for (int i = 0; i < 4; i++) {
    if (i + 1 <= 4) {
   if (array[i] < small) {
     small = array[i];
      } 
    if (array[i] > large) {
     large = array[i];
      } 
    }
  }

  
  cout << small << "\n";
  cout << large << "\n";

}

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main() {
   //std::ios::sync_with_stdio(0); std::cin.tie(0); std::cout.tie(0);

  string input;
  int n;
  cin >> n;
int smallX = 100, smallY = 100, largeX = 0, largeY = 0;

  for (int j = 0; j < n; j++) {
    cin >> input;
  int commaIndex = 0;
  int length = input.size();


  for (int i = 0; i < length; i++) {
    if (input[i] == 44) {
      commaIndex = i;
      break;
    }
  }

    int firstNum = 0;
    if (commaIndex == 1) {
      firstNum = input[0]-48;
    } else {
      firstNum = ((input[0]-48)*10) + (input[1]-48);
    }

    int secondNum = 0;
    if (length - 1 - commaIndex == 2) {
      secondNum = ((input[commaIndex + 1]-48)*10) + (input[commaIndex + 2]-48);
    } else {
      secondNum = (input[commaIndex+1] - 48);
    }

    if (firstNum < smallX) {
      smallX = firstNum;
    } if (firstNum > largeX) {
      largeX = firstNum;
    } if (secondNum < smallY) {
      smallY = secondNum;
    } if (secondNum > largeY) {
      largeY = secondNum;
    }
  }

  cout << (smallX - 1) << "," << (smallY - 1) << "\n";
  cout << (largeX + 1) << "," << (largeY + 1) << "\n";
  
  
}

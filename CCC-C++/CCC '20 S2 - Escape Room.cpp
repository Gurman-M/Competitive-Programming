#include <iostream>
#include <array>

using namespace std;
/*
bool valid(int arr[], int value, int target) {
  for (int i = 0; i < target; i++) {
    if (arr[i] == value) {
      return true;
    }
  }
    return false;
}
*/
int main() {
  ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
  bool valid[1000001];
  int row, column;
  cin >> row >> column;
  int arr[row+1][column+1];
  //is a subsitute for size of the array, also represents bottom corner or EXIT
  int target = row * column;
  int checked[target];

  //creates the escape room
  for (int i = 1; i <= row; i++) {
    for (int j = 1; j <= column; j++) {
      cin >> arr[i][j];
    }
  }

//filling up the array with -1, means that it is unchecked
  for (int i = 0; i < target; i++) {
    checked[i] = -1;
  }

  int node = 0, current_node = 0, arrayIJ;
      checked[node] = arr[1][1];
      node++;

  if (checked[current_node] == target) {
    cout << "yes\n";
    return 0;
  }
  
  do {
  for (int i = 1; i <= row; i++) {
    if (checked[current_node]% i == 0) {
    for (int j = 1; j <= column; j++) {
      if (i * j == checked[current_node]) {
        arrayIJ = arr[i][j];
        if (arr[i][j] == target) {
          cout << "yes\n";
          return 0;
        }

        if (valid[arrayIJ] == false) {
         checked[node] = arrayIJ;
         node++;
         valid[arrayIJ] = true;
         }

         if ( (j+1) > checked[current_node]/i) {
            break;
         }
        }
      }
    }
  }
    current_node++;
} while (checked[current_node] != -1);
  
   cout << "no\n";
  return 0;
  

}

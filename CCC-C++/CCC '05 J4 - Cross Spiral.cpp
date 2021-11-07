#include <bits/stdc++.h>
#include <vector>

using namespace std;

int main() {
  int height, width;
  int l, w, steps;
  int counter = 0;
  cin >> width >> height >> l >> w;
  cin >> steps;
  int room[height+1][width+1];
  //grid created with cross
  for (int i = 1; i <= height; i++) {
    for (int j = 1; j <= width; j++) {
        if (l >= j || l >= ((width + 1) - j)) {
          if (i <= w || (height+1) - i <= w) {
            room[i][j] = 0;
        } else {
        room[i][j] = 1;
      }
    } else {
        room[i][j] = 1;
      } 
  }
}

vector <pair<int, int>> nums;

int top = 0;
int bottom = width;
int left = l + 1;
int right = height - l;

  while (nums.size() != steps) {
    //left to right
    for (int i = left; i <= right && counter != steps; i++) {
      nums.push_back(make_pair(top, i));
      counter++;
    }
    top++;
    //down
    for (int i = top; i < bottom; i++) {
      nums.push_back(make_pair(i, right));
      counter++;
    }
    right--;
    //right to left
    for (int i = right; i > left && counter != steps; i--) {
      nums.push_back(make_pair(bottom, i));
      counter++;
    }
    bottom--;
    //up
    for (int i = bottom; i > top && counter != steps; i--) {
      nums.push_back(make_pair(i, left));
      counter++;
    }
    left++;
  }

  cout << nums[steps-1].first << "\n" << nums[steps-1].second << "\n";
/*
  for (int i = 1; i <= height; i++) {
    for (int j = 1; j <= width; j++) {
      cout << room[i][j] << "\t";
    }
      cout << "\n";
  }
*/

  }


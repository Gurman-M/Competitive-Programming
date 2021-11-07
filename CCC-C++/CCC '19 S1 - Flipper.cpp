#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
  string pos;
  cin >> pos;

  vector <int> points = {1, 2, 3, 4};
  int p1;
  int p2;
  int p3;
  
  for (int i = 0; i < pos.size(); i++) {
    if (pos[i] == 'H') {
      p1 = points[0];
      p2 = points[1];
      points.erase(points.begin(), points.begin() + 2);
      points.push_back(p1);
      points.push_back(p2);
    } 

    if (pos[i] == 'V') {
      p1 = points[0];
      p2 = points[1];
      replace(points.begin(), (points.begin() + 2), points[0], points[1]);
      points[1] = p1;
      p1 = points[2];
      p2 = points[3];
       replace((points.begin() + 2), points.end(), points[2], points[3]);
       points[3] = p1;
    }
  }

   cout << points[0] << " " << points[1] << "\n";
   cout << points[2] << " " << points[3] << "\n";



  
}

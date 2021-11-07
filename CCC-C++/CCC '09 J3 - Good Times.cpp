#include <iostream>
#include <string>

using namespace std;

int localTime(int time, int n) {
  int local;
  local = time + n;

  if (local < 0) {
    local += 2400;
  } 

  if (local > 2400) {
    local -= 2400;
  }

  if (local%100 >= 60) {
    local = (local/100*100 + 100) + (local%100 - 60);
  }

  return local;
}
int main() {

int ottawa;
cin >> ottawa;

cout << localTime(ottawa, 0) << " in Ottawa\n";
cout << localTime(ottawa, -300) << " in Victoria\n";
cout << localTime(ottawa, -200) << " in Edmonton\n";
cout << localTime(ottawa, -100) << " in Winnipeg\n";
cout << localTime(ottawa, 0) << " in Toronto\n";
cout << localTime(ottawa, 100) << " in Halifax\n";
cout << localTime(ottawa, 130) << " in St. John's\n";

}

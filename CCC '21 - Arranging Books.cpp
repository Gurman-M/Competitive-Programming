#include <bits/stdc++.h>

using namespace std;

int main() {
  string letters = "";
  //6 x L
  //4 x S
  //5 x M
  //cin >> letter;
  int lcount = 0, mcount = 0;
  //finding the number of M and L in the shelf
  for (int i = 0; i < letters.size(); i++) {
    if (letters[i] == 'L') {
      lcount++;
    } else if (letters[i] == 'M') {
      mcount++;
    }
  }

  //counting the number of M and S where all L should be
  int section1Ms = 0, section1S = 0;
  for (int i = 0; i < lcount; i++) {
    if (letters[i] == 'M') {
      section1Ms++;
    } else if (letters[i] == 'S') {
      section1S++;
    }
  }

  //count the number of L and S where all M should be
  int section2Ls = 0, section2S = 0;
  for (int i = lcount; i < lcount+mcount; i++) {
    if (letters[i] == 'L') {
      section2Ls++;
    } else if (letters[i] == 'S') {
      section2S++;
    }
  }

  
  //count the number of L and M where all S should be
  int section3Ls = 0, section3Ms = 0;
  for (int i = lcount+mcount+1; i < letters.size(); i++) {
    if (letters[i] == 'L') {
      section3Ls++;
    } else if (letters[i] == 'S') {
      section3Ms++;
    }
  }

  //swapping section 1 and section 3
  int swaps = 0;

  if (section1S != 0 && section3Ls != 0) {
    if (section1S == section3Ls) {
      swaps += section3Ls;
      section3Ls = 0;
      section1S = 0;
    } else if (section1S < section3Ls) {
      swaps += section1S;
      section3Ls -= section1S;
      section1S = 0;
    } else if (section1S > section3Ls) {
      swaps += section3Ls;
      section1S -= section3Ls;
      section3Ls = 0;
    }
  }

  //swapping section 1 and section 2
  if (section1Ms != 0 && section2Ls != 0) {
    if (section1Ms == section2Ls) {
      swaps += section2Ls;
      section2Ls = 0;
      section1Ms = 0;
    } else if (section1Ms < section2Ls) {
      swaps += section1Ms;
      section2Ls -= section1Ms;
      section1Ms = 0;
    } else if (section1Ms > section2Ls) {
      swaps += section2Ls;
      section1Ms -= section2Ls;
      section2Ls = 0;
    }
  }

  //swapping section 2 and 3
  if (section2S != 0 && section3Ms != 0) {
    if (section2S == section3Ms) {
      swaps += section3Ms;
      section3Ms = 0;
      section1S = 0;
    } else if (section2S < section3Ms) {
      swaps += section2S;
      section3Ms -= section2S;
      section3Ms = 0;
    } else if (section2S > section3Ms) {
      swaps += section3Ms;
      section2S -= section3Ms;
      section3Ms = 0;
    }
  }

  //must multiplt it by 2 because each triplet requires 2 swaps???
  swaps += (section1S + section2Ls + section2S + section2Ls + section3Ls + section3Ms)/3*2;

  cout << swaps << endl;

}

public int max1020(int a, int b) {
  if (a > b) {
    int temp = b;
    b = a;
    a = temp;
  }
  
  if (b >= 10 && b <= 20) {
    return b;
  } 
  
  if (a >= 10 && a <= 20) {
    return a;
  }
  
  return 0;
}

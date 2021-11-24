public boolean nearHundred(int n) {
  int n1 = Math.abs(100 - n);
  int n2 = Math.abs(200 - n);
  
  if (n1 <= 10 || n2 <= 10) return true;
  
  return false;
}

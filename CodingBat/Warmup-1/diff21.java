public int diff21(int n) {
  int diff = n - 21;
  if (diff < 0) {
    diff *= -1;
    return diff;
  }
  
  if (n > 21)
    return diff * 2;
    
  return diff;
}

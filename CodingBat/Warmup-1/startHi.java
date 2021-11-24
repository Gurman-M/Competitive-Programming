public boolean startHi(String str) {
  String x = "hi";
  
  if (str.length() >= 2 && str.substring(0, 2).equals(x)) return true;
  
  return false;
}

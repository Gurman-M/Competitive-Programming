public String minCat(String a, String b) {
  String newStr = "";
  
  int al = a.length();
  int bl = b.length();
  
  if (a.length() == b.length()) return a + b;
  else if (a.length() > b.length()) {
    a = a.substring(al - bl, al);
  }
  else if (b.length() > a.length()) {
    b = b.substring(bl - al, bl);
  }
  
  return a + b;
  
}

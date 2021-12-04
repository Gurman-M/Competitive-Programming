public String lastChars(String a, String b) {
  String missing = "";
  if (a.length() == 0) {
    missing += "@";
    a = missing;
  }
  if (b.length() == 0) {
    missing += "@";
    b = missing;
  }
  
  return a.substring(0, 1) + b.substring(b.length()-1, b.length());
  
  
}

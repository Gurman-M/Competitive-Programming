public String everyNth(String str, int n) {
  String newStr = "";
  newStr += str.charAt(0);
  
  for (int i = 1; i < str.length(); i++) {
    if (i % n == 0) {
      newStr += str.charAt(i);
    }
  }
  
  return newStr;
}

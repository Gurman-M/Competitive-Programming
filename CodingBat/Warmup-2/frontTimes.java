public String frontTimes(String str, int n) {
  String newStr = "";
  if (str.length() >= 3) {
      str = str.substring(0, 3);
    }
    
  for (int i = 0; i < n; i++) {
    newStr += str;
  }
  
  return newStr;
}

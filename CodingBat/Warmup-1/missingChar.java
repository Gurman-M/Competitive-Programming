public String missingChar(String str, int n) {
  String str2 = str.substring(0, n);
  String add = "";
  
  //if (n != str.length()-1) {
    add = str.substring(n+1, str.length());
  //}
  
  return str2 += add;
}

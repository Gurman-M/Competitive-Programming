public String without2(String str) {
  if (str.length() < 2) {
    return str;
  }
  
  String compare = str.substring(0, 2);
  String compare2 = str.substring(str.length()-2, str.length());
  if (compare.equals(compare2)) {
    return str.substring(2, str.length());
  }
  
  return str;
}

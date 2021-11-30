public String left2(String str) {
  String newStr = "";
  
  newStr = str.substring(2, str.length()) + str.substring(0, 2);
  
  return newStr;
}

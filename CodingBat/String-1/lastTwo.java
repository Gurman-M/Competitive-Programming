public String lastTwo(String str) {
  String newStr = "";
  if (str.length() > 1) {
    newStr += str.substring(0, str.length() - 2);
    newStr += (str.charAt(str.length() - 1) + "");
    newStr += (str.charAt(str.length() - 2) + "");
  } else return str;
  
  return newStr;
}

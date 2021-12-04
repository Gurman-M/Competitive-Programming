public String seeColor(String str) {
  String r = "red";
  String b = "blue";
  
  if (str.length() >= 4 && str.substring(0, 4).equals(b)) {
    return b;
  } else if (str.length() >= 3 && str.substring(0, 3).equals(r)) {
    return r;
  }
  
  return "";
}

public String endUp(String str) {
  String front = "";
  String back = "";
  
  if (str.length() < 3) return str.toUpperCase();
  else {
    front = str.substring(0, str.length()-3);
    back = str.substring(str.length()-3, str.length());
  }
  
  return front + back.toUpperCase();
}

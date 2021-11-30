public String makeOutWord(String out, String word) {
  String newStr = "";
  newStr += out.substring(0, 2);
  newStr += word + out.substring(2, out.length());
  
  return newStr;
}

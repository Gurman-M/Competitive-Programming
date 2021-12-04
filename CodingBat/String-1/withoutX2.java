public String withoutX2(String str) {
    String newStr = "";
    
  for (int i = 0; i < 2; i++) {
    if (str.length() > 0 && str.charAt(0) == 'x') {
      str = str.substring(1);
    } else if (str.length() > 0 && !(str.charAt(0) == 'x')) {
      newStr += (str.charAt(0) + "");
      str = str.substring(1);
    }
  }
    
    return newStr + str;
}

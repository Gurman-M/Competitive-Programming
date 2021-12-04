public String withoutX(String str) {
  String newStr = "";
  
  if (str.length() < 1) return str;
  
  String c1 = str.substring(0, 1);
  String c2 = str.substring(str.length()-1, str.length());
  
  if (!c1.equals("x")) newStr += c1;
  
  if (str.length() > 1) newStr += str.substring(1, str.length()-1);
  
  if (!c2.equals("x")) newStr += c2;
  
  return newStr;
}

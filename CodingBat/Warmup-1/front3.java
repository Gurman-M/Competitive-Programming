public String front3(String str) {
  if (str.length() < 3) return str += str + str;
  
  String str2 = str.substring(0, 3); 
  return str2 += str2 + str2;
}

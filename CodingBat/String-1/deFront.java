public String deFront(String str) {
  String first = "a";
  String second = "b";
  String newStr = "";
  if (str.length() > 1) {
    if (str.substring(0, 1).equals(first)) newStr += first;
    if (str.substring(1, 2).equals(second)) newStr += second;
  } 
  
  return newStr + str.substring(2, str.length());
}

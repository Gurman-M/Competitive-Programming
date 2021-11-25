int countXX(String str) {
  int count = 0;
  for (int i = 0; i < str.length(); i++) {
    if ((i + 1 < str.length()) && (str.charAt(i) + "" + str.charAt(i+1) + "").equals("xx")) {
      count++;
    }
  }
  
  return count;
}

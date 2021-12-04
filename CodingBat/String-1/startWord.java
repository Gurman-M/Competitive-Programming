public String startWord(String str, String word) {
  if (str.length() >= word.length()) {
    String compare = str.substring(1, word.length());
    String compare2 = word.substring(1, word.length());
    if (compare.equals(compare2)) return str.substring(0, word.length());
  }
  
  return "";
}

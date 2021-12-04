public String middleThree(String str) {
  int middle = (str.length() - 1)/2;
  return str.substring(middle - 1, middle + 2);
}

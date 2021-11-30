public String makeTags(String tag, String word) {
  String border = "<" + tag + ">";
  String border2 = "</" + tag + ">";
  return border + word + border2;
}

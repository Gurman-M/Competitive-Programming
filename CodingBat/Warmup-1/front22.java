public String front22(String str) {
  String k = str;
		String front = "";
		if (k.length() >= 2) {
			front = k.substring(0, 2);
		} else {
		  front = k;
		}
		
		k = front + k + front;
		
		return k;
}

public String conCat(String a, String b) {
    String c1 = "";
		String c2 = "";
		
		if (a.length() > 0) {
			c1 += a.substring(a.length() - 1, a.length());
		}
		
		if (b.length() > 0) {
		  c2 += b.substring(0, 1);
		}
		
		if (c1.equals(c2)) {
			if (a.length() > 1) {
				a = a.substring(0, a.length() - 1);
			} else a = "";
		} 
		
		return a + b;
}

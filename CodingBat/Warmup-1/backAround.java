public String backAround(String str) {
    
      String mid = str;
    
			if (str.length() == 1) return str + str + str;
			 
			String last = str.charAt(str.length()-1) + "";
			 
			return last + mid + last;
  
}

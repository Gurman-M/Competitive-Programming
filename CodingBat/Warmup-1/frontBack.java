public String frontBack(String str) {

    if (str.length() <= 1) return str;
    
    int i = 0;
			
    int j = str.length()-1;
			
	  String mid = str.substring(i+1, j);
			  
  	String str2 = str.charAt(j) + mid + str.charAt(i);
  
    return str2;
  
}

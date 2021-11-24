public boolean frontAgain(String str) {
		if (str.length() >= 2) {
		    String first = str.charAt(0) + "";
		    first += str.charAt(1);
		    
		    String last = str.charAt(str.length()-2) + "";
		    last += str.charAt(str.length()-1) + "";
		    
		    if (first.equals(last)) {
		      return true;
		    }
		    
		  }
		  
		  return false;
}

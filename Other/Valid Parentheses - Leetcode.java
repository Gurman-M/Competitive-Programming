 public boolean isValid(String s) {
         ArrayList <Character> brace = new ArrayList<>();
			
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (c == '(' || c == '{' || c == '[') {
					brace.add(c);
				} else if (c == ')') {
					if (brace.isEmpty() || brace.get(brace.size()-1) != '(') return false;
					else brace.remove(brace.size()-1);
				} else if (c == '}') {
					if (brace.isEmpty() || brace.get(brace.size()-1) != '{') return false;
					else brace.remove(brace.size()-1);
				} else if (c == ']') {
                    if (brace.isEmpty() || brace.get(brace.size()-1) != '[') return false;
					else brace.remove(brace.size()-1);
                }
			}
		
		return brace.isEmpty();
    }

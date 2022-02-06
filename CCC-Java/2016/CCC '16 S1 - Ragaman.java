import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String start = br.readLine();
		String word = br.readLine();
		int aster = 0;
		
		ArrayList<String> sLetters = new ArrayList<>();
		
		for (int i = 0; i < start.length(); i++) {
			String c = start.charAt(i) + "";
			sLetters.add(c);
		}
		
		for (int i = 0; i < word.length(); i++) {
			String c = word.charAt(i) + "";
			
			if (sLetters.contains(c)) {
				sLetters.remove(c);
			}
			
			if (c.equals("*")) aster++;
		}
		
		if (sLetters.size() == 0 || sLetters.size() - aster == 0) {
			System.out.println("A");
		} else {
			System.out.println("N");
		}
    
	}
}

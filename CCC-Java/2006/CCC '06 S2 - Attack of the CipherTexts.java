import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashMap <String, String> map = new HashMap<>();
		
		String start = sc.nextLine();
		String code = sc.nextLine();
		
		for (int i = 0; i < start.length(); i++) {
			String letter = (start.charAt(i) + "");
			String codeLetter = (code.charAt(i) + "");
			
			map.put(codeLetter, letter);
		}
		
		String decode = sc.nextLine();
		String message = "";
		
		for (int i = 0; i < decode.length(); i++) {
			if (map.get((decode.charAt(i) + "")) == null) message += ".";
			else message += map.get((decode.charAt(i) + ""));
		}
		
		//System.out.println(map);
		System.out.println(message);
	}
}

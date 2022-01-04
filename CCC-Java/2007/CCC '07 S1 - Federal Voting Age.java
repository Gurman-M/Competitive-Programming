import java.util.Scanner;	

public class Main {

	public static void main(String[] args) {
		//election February 27, 2007
		//18 years before election is February 27, 1989
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			boolean eligible = false;
			
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			
			if (year <= 1989) eligible = true;
			
			if (year == 1989) {
				if (month > 2) eligible = false;
				if (month >= 2 && day > 27) eligible = false;
			}
			
			if (eligible) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
    
	}
}

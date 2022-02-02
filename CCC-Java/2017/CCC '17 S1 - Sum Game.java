import java.util.ArrayList;
import java.util.Scanner;	

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList <Integer> swifts = new ArrayList<>();
		ArrayList <Integer> sema = new ArrayList<>();
		
		int swiftRuns = 0;
		int semaRuns = 0;
		int k = -1;
		
		int days = sc.nextInt();
		
		for (int i = 0; i < days; i++) {
			int runs = sc.nextInt();
			swifts.add(runs);
		}
		
		for (int i = 0; i < days; i++) {
			int runs = sc.nextInt();
			sema.add(runs);
		}
		
		
		for (int i = 0; i < days; i++) {
			swiftRuns += swifts.get(i);
			semaRuns += sema.get(i);
			
			if (swiftRuns == semaRuns) k = i;
		}
		
	
		if (k == -1) System.out.println(0);
		else System.out.println(k + 1);
	}
}

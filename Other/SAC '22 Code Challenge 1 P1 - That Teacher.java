import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //kids
		int m = sc.nextInt(); //candy bars for each kid
		int c = sc.nextInt(); //candy bars total
		
		int leftover = c - (m * n);
		
		System.out.println(leftover);
				
	}
}

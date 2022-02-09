import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//1 min speed
		//2 max speed
		int n = Integer.parseInt(br.readLine());
		int o = Integer.parseInt(br.readLine());
		int sum = 0;
		
		String[] dmoj = br.readLine().split(" ");
		String[] peg = br.readLine().split(" ");
		
		ArrayList<Integer> dlist = new ArrayList<>();
		ArrayList<Integer> plist = new ArrayList<>();
		
		for (int i = 0; i < o; i++) {
			dlist.add(Integer.parseInt(dmoj[i]));
			plist.add(Integer.parseInt(peg[i]));
		}
		
		Collections.sort(dlist);
		Collections.sort(plist);
		
		if (n == 2) {
			int j = o - 1;
			for (int i = 0; i < o; i++) {
				int num1 = dlist.get(i);
				int num2 = plist.get(j);
				
				sum += Math.max(num1, num2);
				//System.out.println(Math.max(num1, num2));
				j--;
			}
		} else if (n == 1) {
			for (int i = 0; i < o; i++) {
				int num1 = dlist.get(i);
				int num2 = plist.get(i);
				
				sum += Math.max(num1, num2);
				//System.out.println(Math.max(num1, num2));
			}
		}
		
		System.out.println(sum);
	}
}

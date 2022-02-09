import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), sum = 0;
		ArrayList<Integer> finalNums = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (i > 0 && num == 0) {
				finalNums.remove(finalNums.size() - 1);
			} else {
				finalNums.add(num);
			}	
		}
		
		for (int i = 0; i < finalNums.size(); i++) {
			sum += finalNums.get(i);
		}
		
		System.out.println(sum);
	}
}

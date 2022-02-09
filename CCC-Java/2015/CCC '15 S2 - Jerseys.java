import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int counter = 0;
		
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String size = br.readLine();
			list.add(size);
		}
		
		for (int i = 0; i < a; i++) {
			String[] input = new String[2];
			String req;
			int num;
			
			input = br.readLine().split(" ");
			
			req = input[0];
			num = Integer.parseInt(input[1]);
			
			String jSize = list.get(num - 1);
			
			if (req.equals("S") && (jSize.equals("S") || jSize.equals("M") || jSize.equals("L"))) {
				list.set(num - 1, "0");
				counter++;
			} else if (req.equals("M") && (jSize.equals("M") || jSize.equals("L"))) {
				list.set(num - 1, "0");
				counter++;
			} else if (req.equals("L") && (jSize.equals("L"))) {
				list.set(num - 1, "0");
				counter++;
			}
		}
		
		//System.out.println(list);
		System.out.println(counter);
		
	}
}

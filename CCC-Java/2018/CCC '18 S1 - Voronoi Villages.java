import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Double> villages = new ArrayList<>();
		ArrayList<Double> vSizes = new ArrayList<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			double point = Double.parseDouble(br.readLine());
			villages.add(point);
		}
		
		Collections.sort(villages);
		
		for (int i = 1; i < villages.size() - 1; i++) {
			double minPoint = (villages.get(i) + villages.get(i - 1))/2;
			double maxPoint = 0;
			
			if (i + 1 < villages.size()) maxPoint = (villages.get(i + 1) + villages.get(i))/2;
			
			vSizes.add(maxPoint - minPoint);
		}
		
		//System.out.println(villages);
		//System.out.println(vSizes);
		
		double val = Collections.min(vSizes);
		System.out.printf("%.1f", val);
		
	}
}

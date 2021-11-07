import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//width(height + height/2)
		int n = sc.nextInt();
		int j = 0;
		double totalArea = 0;
		
		ArrayList <Double> heights = new ArrayList<>();
		ArrayList <Double> widths = new ArrayList<>();
		
		for (int i = 0; i < (n + 1); i++) {
			double height = sc.nextInt();
			heights.add(height);
		}
		
		for (int i = 0; i < n; i++) {
			double width = sc.nextInt();
			widths.add(width);
		}
		
		for (int i = 1; i < heights.size(); i++) {
			if (i - 1 >= 0) {
				double area = ((heights.get(i) + heights.get(i-1))/2)*widths.get(j);
				totalArea += area;
			}
			
			j++;
			
		}
		
		System.out.printf("%.1f", totalArea);
	}
}

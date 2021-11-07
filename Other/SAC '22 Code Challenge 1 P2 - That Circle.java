import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(), h = sc.nextInt(), w = sc.nextInt();
		DecimalFormat df = new DecimalFormat("##############.##");
		
		double d = sc.nextDouble();
		double radius = d/2;
		
		//leftover = volume of rectangle - volume of cylinder
		//V = pi(r)^2H
		
		double leftover = (l*h*w) - (Math.PI * Math.pow(radius, 2) * h);
		
		System.out.println(df.format(leftover));
				
	}
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String dad = sc.next();
		String mom = sc.next();
		
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < dad.length(); i += 2) {
			String a = "";
			String b = "";
			
				a = dad.substring(i, i + 2);
				b = mom.substring(i, i + 2);
				
				String dom = a.toUpperCase();
				String rec = a.toLowerCase();
				String mixed = a.substring(0, 1).toUpperCase() + a.substring(1, 2).toLowerCase();
				
				if ((a.equals(dom) && b.equals(rec)) || (b.equals(dom) && a.equals(rec))) {
					list.add(a.substring(0, 1).toLowerCase());
				}
				
				if ((a.equals(dom) && b.equals(mixed)) || (b.equals(dom) && a.equals(mixed))) {
					list.add(a.substring(0, 1).toLowerCase());
				}
				
				if ((a.equals(dom) && b.equals(dom))) {
					list.add(a.substring(0, 1).toLowerCase());
				}
				
				if (a.equals(rec) && b.equals(rec)) {
					list.add(a.substring(0, 1).toUpperCase());
				}
		}
		
		//System.out.println(list);
		
		
		int babies = sc.nextInt();
		
		for (int i = 0; i < babies; i++) {
			String code = sc.next();
			boolean baby = true;
			for (int j = 0; j < code.length(); j++) {
				if (list.contains(code.substring(j, j+1))) {
					baby = false;
				}
			}
			
			if (baby) System.out.println("Possible baby.");
			else if (!baby) System.out.println("Not their baby!");
		}
	}
}

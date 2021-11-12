import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt(), c = sc.nextInt();
		int grid[][] = new int[r][c];
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int newCol = sc.nextInt() - 1;
			for (int row = r - 1; row >= 0; row--) {
					if (row > 0 && grid[row][newCol] < grid[row-1][newCol]) {
							for (int col = 0; col < c; col++) {
								int holder = grid[row-1][col];
								grid[row-1][col] = grid[row][col];
								grid[row][col] = holder;
							}
					}
					
					if (row + 1 < r && grid[row+1][newCol] < grid[row][newCol]) {
						while (row + 1 < r && grid[row+1][newCol] < grid[row][newCol]) {
							for (int col = 0; col < c; col++) {
								int holder = grid[row+1][col];
								grid[row+1][col] = grid[row][col];
								grid[row][col] = holder;
							}
						
							if (row + 1 < r) row++;
						}
					}
				}
			}	
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		
	} 
}

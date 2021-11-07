import java.io.*;
import java.util.*;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int grid[][] = new int[x][x];
		ArrayList <Integer> arr = new ArrayList();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				int val = sc.nextInt();
				
				if (val < min) min = val;
				grid[i][j] = val;
			}
		}
	
				if (min == grid[0][0]) {
				
					for (int i = 0; i < x; i++) {
						for (int j = 0; j < x; j++) {
							System.out.print(grid[i][j] + " ");
						}
						
						System.out.println();
					}
				} else if (min == grid[x-1][0]) {
					
					for (int col = 0; col < x; col++) {
						for (int row = 0; row < x; row++) {
							System.out.print(grid[x - 1 - row][col] + " ");
						}
						System.out.println();
					} 
				} else if (min == grid[x-1][x-1]) {
					
					for (int col = 0; col < x; col++) {
						for (int row = 0; row < x; row++) {
							System.out.print(grid[x - 1 - col][x - 1 - row] + " ");
						}
						System.out.println();
					}
				} else if (min == grid[0][x-1]) {
					
					for (int col = 0; col < x; col++) {
						for (int row = 0; row < x; row++) {
							System.out.print(grid[row][x - 1 - col] + " ");
				}
						System.out.println();
			}
		}
				
	}
}

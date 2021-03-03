package Functions;

import java.util.Scanner;

public class WavePrint {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int[][] arr = new int[10][10];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		for (int row = 0; row < m; row++) {
			if (row % 2 == 0) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[row][j] + ", ");
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					System.out.print(arr[row][j] + ", ");
				}
			}
		}
		System.out.print("END");
		scn.close();
	}

}

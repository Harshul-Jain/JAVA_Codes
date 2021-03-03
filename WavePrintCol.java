package Functions;

import java.util.Scanner;

public class WavePrintCol {

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
		for (int col = 0; col < n; col++) {
			if (col % 2 == 0) {
				for (int j = 0; j < m; j++) {
					System.out.print(arr[j][col] + ", ");
				}
			} else {
				for (int j = m - 1; j >= 0; j--) {
					System.out.print(arr[j][col] + ", ");
				}
			}
		}
		System.out.print("END");
		scn.close();
	}

}

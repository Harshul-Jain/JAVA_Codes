package Functions;

import java.util.Scanner;

public class MatrixSearch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int[][] arr = new int[31][31];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		int target = scn.nextInt();
		scn.close();
		int i = 0;
		int j = n - 1;
		while (i < m && j >= 0) {
			if (arr[i][j] == target) {
				System.out.println("1");
				return;
			} else if (arr[i][j] < target) {
				i++;
			} else {
				j--;
			}
		}
		System.out.println("0");
	}

}

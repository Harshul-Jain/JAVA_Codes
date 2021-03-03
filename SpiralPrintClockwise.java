package Functions;

import java.util.Scanner;

public class SpiralPrintClockwise {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int[][] arr = new int[11][11];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		int top = 0;
		int bottom = m - 1;
		int left = 0;
		int right = n - 1;
		int s = 0;
		while (top <= bottom && left <= right) {
			for (int j = left; j <= right; j++) {
				System.out.print(arr[top][j] + ", ");
				s++;
			}
			for (int i = top + 1; i <= bottom; i++) {
				s++;
				System.out.print(arr[i][right] + ", ");
			}
			for (int j = right - 1; j >= left; j--) {

				if (s >= m * n) {
					break;
				}
				s++;
				System.out.print(arr[bottom][j] + ", ");
			}
			for (int i = bottom - 1; i > top; i--) {
				s++;
				System.out.print(arr[i][left] + ", ");
			}
			left++;
			right--;
			top++;
			bottom--;
		}
		System.out.print("END");
		scn.close();
	}

}

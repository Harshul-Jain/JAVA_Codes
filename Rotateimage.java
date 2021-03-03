package Functions;

import java.util.Scanner;

public class Rotateimage {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[][] arr = new int[1000][1000];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		scn.close();
	}

}

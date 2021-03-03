package Functions;

import java.util.Scanner;

public class SortGame {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//int x = scn.nextInt();
		int n = scn.nextInt();
		char[][] arr = new char[100001][101];
		int[] arrnum = new int[100001];
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < 100; j++) {
				char c = scn.next().charAt(0);
				if (c != ' ')
					arr[i][j] = c;
				else
					break;
			}
			arrnum[i] = scn.nextInt();

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.print(" " + arrnum[i]);
			System.out.println();
		}
		scn.close();
	}

}

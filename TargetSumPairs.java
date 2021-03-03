package Functions;

import java.util.Scanner;

public class TargetSumPairs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[1000];
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int m = scn.nextInt();
		TargetSumPair(arr, m, n);
		scn.close();
	}

	public static void TargetSumPair(int[] arr, int m, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = arr[i] + arr[j];
				if (sum == m) {
					if (arr[i] > arr[j]) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
					System.out.println(arr[i] + " and " + arr[j]);
				}
			}
		}
	}

}

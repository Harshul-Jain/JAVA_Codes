package Functions;

import java.util.Scanner;

public class BioticSubsequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int testcase = scn.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = scn.nextInt();
			int[] arr = new int[1001];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			int[] I = new int[1001];
			int[] D = new int[1001];
			I[0] = 1;
			D[n - 1] = 1;
			for (int i = 1; i < n; i++) {
				if (arr[i] > arr[i - 1]) {
					I[i] = I[i - 1] + 1;
				} else {
					I[i] = 1;
				}
			}
			for (int i = n - 2; i >= 0; i--) {
				if (arr[i] > arr[i + 1]) {
					D[i] = D[i + 1] + 1;
				} else {
					D[i] = 1;
				}
			}
			int max = 0;
			for (int i = 0; i < n; i++) {
				max = Math.max(max, I[i] + D[i] + 1);
			}
			System.out.println(max);
		}
		scn.close();
	}
}

package Functions;

import java.util.Scanner;

public class GrandTemp {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arrx = new int[100001];
		int[] arry = new int[100001];
		for (int i = 0; i < n; i++) {
			arrx[i] = scn.nextInt();
			arry[i] = scn.nextInt();

		}
		sort(n, arrx);
		sort(n, arry);
		int maxx = 0;
		int maxy = 0;
		for (int i = 1; i < n; i++) {
			if (maxx < arrx[i] - arrx[i - 1]) {
				maxx = arrx[i] - arrx[i - 1];
			}
			if (maxy < arry[i] - arry[i - 1]) {
				maxy = arry[i] - arry[i - 1];
			}
		}
		System.out.println((maxx - 1) * (maxy - 1));

		scn.close();
	}

	public static void sort(int n, int[] arr) {
		for (int counter = 1; counter < n; counter++) {
			int j = counter - 1;
			int val = arr[counter];
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}

	}

}

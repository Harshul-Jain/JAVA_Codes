package Functions;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[1001];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		for (int counter = 1; counter < n; counter++) {
			int val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		scn.close();
	}

}

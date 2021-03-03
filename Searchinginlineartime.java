package Functions;

import java.util.Scanner;

public class Searchinginlineartime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[1000001];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int low = 0;
		int mid = 0;
		int high = n - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		scn.close();
	}
}

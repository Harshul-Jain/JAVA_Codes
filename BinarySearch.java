package Functions;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[1000000000];
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int m = scn.nextInt();
		scn.close();
		int start = 0;
		int end = n - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == m) {
				System.out.println(mid);
				return;
			} else if (arr[mid] < m) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println("-1");
		
	}

}

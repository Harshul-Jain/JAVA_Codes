package Functions;

import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int testcase = scn.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[] arr = new int[1001];
			int totalpages = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
				totalpages += arr[i];
			}
			sort(arr, n);
			int start = arr[n - 1];
			int end = totalpages;
			int ans = 0;
			while (start <= end) {
				int mid = (start + end) / 2;
				System.out.println(mid);
				if (ispossible(arr, n, m, mid)) {
					ans = mid;
					end = mid - 1;

				} else
					start = mid + 1;
			}
			System.out.println(ans);
		}

		scn.close();

	}

	public static void sort(int[] arr, int n) {
		for (int counter = 1; counter < n; counter++) {
			int val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}
	}

	public static boolean ispossible(int[] arr, int n, int m, int minpages) {
		int student = 1;
		int lastposition = arr[0];
		for (int i = 1; i < n; i++) {
			lastposition = lastposition + arr[i];
			if (lastposition > minpages) {
				lastposition = arr[i];
				student++;
			}
			if (student > m) {
				return false;
			}
		}
		return true;
	}

}

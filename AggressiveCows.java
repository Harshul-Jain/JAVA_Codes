package Functions;

import java.util.Scanner;

public class AggressiveCows {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int cows = scn.nextInt();
		int[] arr = new int[100001];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		for (int i = 1; i < n; i++) {
			int val = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}
		int start = 0;
		int end = arr[n - 1];
		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (check(arr, n, cows, mid)) {
				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println(ans);
		scn.close();
	}

	public static Boolean check(int[] arr, int n, int cows, int distance) {
		int lastposition = arr[0];
		int count = 1;
		for (int i = 0; i < n; i++) {
			if (arr[i] - lastposition >= distance) {
				lastposition = arr[i];
				count++;
			}
			if (count == cows) {
				return true;
			}
		}

		return false;
	}

}

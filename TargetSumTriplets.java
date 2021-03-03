package Functions;

import java.util.Scanner;

public class TargetSumTriplets {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[1000];
		int n = scn.nextInt();
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
		int m = scn.nextInt();
		for (int i = 0; i < n; i++) {
			int left = i + 1;
			int right = n - 1;
			while (left < right) {
				int sum = arr[i] + arr[left] + arr[right];
				if (sum == m) {
					System.out.print(arr[i] + ", " + arr[left] + " and " + arr[right] + "\n");
					left++;
					right--;
				} else if (sum < m) {
					left++;
				} else {
					right--;
				}

			}
		}
		scn.close();
	}

}

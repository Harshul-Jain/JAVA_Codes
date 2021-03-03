package Functions;

import java.util.Scanner;

public class countingSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[1000001];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int[] count = new int[1000001];
		for (int i = 0; i < n; i++) {
			count[arr[i]]++;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
		}
		int[] output = new int[1000001];
		for (int i = 0; i < n; i++) {
			output[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(output[i] + " ");
		}

		scn.close();

	}

}

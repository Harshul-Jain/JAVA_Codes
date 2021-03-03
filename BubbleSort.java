package Functions;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[100000];
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int counter = 0;
		while (counter < n) {
			for (int i = 0; i < n - counter - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			counter++;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		scn.close();
	}

}

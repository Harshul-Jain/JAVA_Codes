package Functions;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[1000];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int counter = 0;
		while (counter < n - 1) {
			int i = counter + 1;
			int min = counter;
			while (i < n) {
				if (arr[min] > arr[i]) {
					min = i;
				}
				i++;
			}
			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;
			counter++;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		scn.close();
	}

}

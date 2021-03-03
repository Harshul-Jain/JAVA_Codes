package Functions;

import java.util.Scanner;

public class HelpRahultoSearch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[1000];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int key = scn.nextInt();
		int index = RotatedArray(arr, 0, n - 1, key);
		System.out.println(index);
		scn.close();
	}

	public static int RotatedArray(int[] arr, int start, int end, int key) {
		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if(arr[mid]==key)
		{
			return mid;
		}
		if (arr[start] <= arr[end] && (arr[end] <= arr[mid])) {
			if (key < arr[mid] && key >= arr[start]) {
				return RotatedArray(arr, start, mid - 1, key);
			} else {
				return RotatedArray(arr, mid + 1, end, key);
			}
		}
		if (key < arr[mid] && key >= arr[start]) {
			return RotatedArray(arr, start, mid - 1, key);
		} else {
			return RotatedArray(arr, mid + 1, end, key);
		}

	}

}

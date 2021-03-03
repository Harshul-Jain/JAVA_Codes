package Functions;

import java.util.Scanner;

public class SumoftwoArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr1 = new int[1001];
		for (int i = 0; i < n; i++) {
			arr1[i] = scn.nextInt();
		}
		int m = scn.nextInt();
		int[] arr2 = new int[1001];
		for (int i = 0; i < m; i++) {
			arr2[i] = scn.nextInt();
		}
		int j = 0;
		int temp = 0;
		if (n < m) {
			j = m;
		} else {
			j = n;
		}
		temp = j;
		int i = n;
		int k = m;
		int carry = 0;
		int[] arr = new int[1001];
		for (; i >= 0 && k >= 0; i--, k--) {
			arr[j] = arr1[i] + arr2[k] + carry;
			carry = arr[j] / 10;
			arr[j] = arr[j] % 10;
			j--;
		}
		while (i >= 0) {
			arr[j] = arr1[i] + carry;
			carry = arr[j] / 10;
			arr[j] = arr[j] % 10;
			j--;
			i--;
		}
		while (k >= 0) {
			arr[j] = arr2[k] + carry;
			carry = arr[j] / 10;
			arr[j] = arr[j] % 10;
			j--;
			k--;
		}
		for (int r = 0; r < temp; r++) {
			if(r==0 && carry!=0)
				System.out.print(carry+", ");
			System.out.print(arr[r] + ", ");
		}
		System.out.println("END");
		scn.close();
	}

}

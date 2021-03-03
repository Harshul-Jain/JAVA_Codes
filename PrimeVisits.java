package Functions;

import java.util.Scanner;

public class PrimeVisits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int testcase = scn.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int a = scn.nextInt();
			int b = scn.nextInt();

			int count = 0;
			int[] arr = new int[1000005];
			for (int i = a; i <= b; i++) {

				arr[i] = 1;
			}
			for (int i = 2; i <= b; i++) {
				for (int pp = 2 * i; pp <= b; pp += i) {
					arr[pp] = 0;
				}

			}
			if (a == 0 || a == 1) {
				a = 2;
			}
			for (int i = a; i <= b; i++) {
				if (arr[i] == 1) {
					count++;
				}
			}
			System.out.println(count);
		}
		scn.close();

	}

}

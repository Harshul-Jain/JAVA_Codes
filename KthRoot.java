package Functions;

import java.util.Scanner;
import java.lang.Math;

public class KthRoot {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int testcase = scn.nextInt();
		for (int t = 0; t < testcase; t++) {
			long N = scn.nextLong();
			int k = scn.nextInt();
			long start = 0;
			long end = N;
			long ans = 0;
			while (start <= end) {
				long mid = (start + end) / 2;
				if (Math.pow(mid, k) <= N) {
					ans = mid;
					start = mid + 1;
				} else {
					end = mid - 1;

				}

			}
			System.out.println(ans);
		}
		scn.close();
	}

}

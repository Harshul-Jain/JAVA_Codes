package Functions;

import java.util.Scanner;

public class WinningCBSchorlarship {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		long M = scn.nextLong();
		long X = scn.nextLong();
		long Y = scn.nextLong();
		long start = 0;
		long end = N;
		long ans = 0;
		while (start <= end) {
			long mid = (start + end) / 2;
			if (ispossible(N, M, X, Y, mid)) {
				ans = Math.max(ans, mid);
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println(ans);
		scn.close();
	}

	public static boolean ispossible(long N, long M, long X, long Y, long mid) {
		if (mid * X <= M + (N - mid) * Y)
			return true;
		else
			return false;
	}

}

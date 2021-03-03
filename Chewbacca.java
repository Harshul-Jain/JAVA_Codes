package Functions;

import java.util.Scanner;

public class Chewbacca {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long x = scn.nextLong();
		long ans = 0;
		long pr = 1;
		while (x != 0) {
			long digit = x % 10;
			x = x / 10;
			if (digit >= 5) {
				if (digit == 9 && x == 0) {}
				else
					digit = 9 - digit;
			}
			ans = digit * pr + ans;
			pr = pr * 10;
		}
		scn.close();
		System.out.println(ans);
	}

}

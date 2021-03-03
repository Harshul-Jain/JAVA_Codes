package Functions;

import java.util.Scanner;

public class LowerUpperBond {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[100001];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		int Q = scn.nextInt();
		for (int i = 0; i < Q; i++) {
			int num = scn.nextInt();
			int start = 0;
			int end = N - 1;
			int lower = -1;
			int upper = -1;
			while (start <= end) {
				int mid = (start + end) / 2;
				if (arr[mid] == num) {
					lower = mid;
					upper = mid;
					int startl = start;
					int endl = mid - 1;
					while (startl <= endl) {
						int midl = (startl + endl) / 2;
						if (arr[midl] == num) {
							lower = midl;
							endl = midl - 1;
						} else {
							startl = midl + 1;
						}
					}
					int startup = mid + 1;
					int endup = N - 1;
					while (startup <= endup) {
						int midup = (startup + endup) / 2;
						if (arr[midup] == num) {
							upper = midup;
							startup = midup + 1;
						} else {
							endup = midup - 1;
						}
					}
					break;
				} else if (arr[mid] < num) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
			System.out.print(lower + " " + upper);
			System.out.println();
		}
		scn.close();

	}

}

package week01.problem_10813;

import java.util.Scanner;

public class Before10813 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();

		// 바구니에는 1번부터 N번까지 번호 매겨져 있음.
		int[] bucket = new int[n];
		for (int a = 0; a < n; a++) {
			bucket[a] = a + 1;
		}

		for (int p = 0; p < m; p++) {
			int i = input.nextInt();
			int j = input.nextInt();

			int ii = i - 1;
			int jj = j - 1;

			int temp = bucket[ii];
			bucket[ii] = bucket[jj];
			bucket[jj] = temp;
		}

		for (int j : bucket) {
			System.out.print(j + " ");

		}
	}

}

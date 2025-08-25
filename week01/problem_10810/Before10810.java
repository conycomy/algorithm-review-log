package week01.problem_10810;

import java.util.Scanner;

public class Before10810 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int M = input.nextInt();
		int[] basket = new int[N];

		// 한번 넣을 때, 공을 넣을 바구니 범위
		// 정한 바구니에는 모두 같은 번호가 적혀 있는 번호를 넣음

		for (int m = 1; m <= M; m++) {
			int i = input.nextInt(); // i번 바구니
			int j = input.nextInt(); // j번 바구니
			int k = input.nextInt(); // k번 번호

			for (int b = i - 1; b < j; b++) { // i번부터 j번까지의 바구니
				basket[b] = k;

			}
		}
		for (int x = 0; x < N; x++) {
			System.out.print(basket[x] + " ");
		}
	}

}

package week02.problem_10811;

import java.util.Scanner;

public class Before10811 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();

		int[] basket = new int[n];

		for(int i = 0; i < n; i++) {
			basket[i] = i + 1;
		}

		for(int a = 0; a < m; a++) {
			int i = input.nextInt();
			int j = input.nextInt();

			int l = i - 1;
			int r = j - 1;

			while(l < r) {
				int temp = basket[l];
				basket[l] = basket[r];
				basket[r] = temp;
				l++; r--;
			}
		}
	for(int p = 0; p < basket.length; p++){
		System.out.print(basket[p] + " ");
	}
	}
}

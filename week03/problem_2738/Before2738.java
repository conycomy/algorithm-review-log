package week03.problem_2738;

import java.util.Scanner;

public class Before2738 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt(); //줄 칸이다.

		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		int[][] result = new int[N][M];

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				A[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				B[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				result[i][j] = A[i][j] + B[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}




	}
}

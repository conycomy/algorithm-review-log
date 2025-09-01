package week02.problem_1546;

import java.util.Scanner;

public class Before1546 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] grade = new int[N];

		for(int i = 0; i < N; i++) {
			grade[i] = scan.nextInt();
		}

		//최댓값 찾기
		int M = grade[0];
		for(int i = 1; i < N; i++) {
			if(grade[i] > M) {
				M = grade[i];
			}
		}

		double sum = 0;
		for(int i = 0; i < N; i++) {
			sum += (double) grade[i] / M * 100;
		}

		System.out.println(sum / N);
	}

}

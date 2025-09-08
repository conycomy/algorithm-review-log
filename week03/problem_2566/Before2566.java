package week03.problem_2566;

import java.util.Scanner;

public class Before2566 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 2차원 배열 선언
		int[][] matrix = new int[9][9];

		// 주어지는 수 입력
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<9; j++) {
				matrix[i][j] = scan.nextInt();
				System.out.print(matrix[i][j] + " ");
			}
		}

		// 최댓값 로직
		int max = matrix[0][0];
		

		int row = 0; // 최댓값 행 인덱스
		int col = 0; // 최댓값 열 인덱스
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<9; j++) {
				if(matrix[i][j] > max){
					max = matrix[i][j];
					row = i;
					col = j;

				}
			}
		}

		// 첫째줄에 최댓값 입력
		System.out.println(max);
		// 둘째줄에 최댓값이 위치한 행 번호와 열 번호 찾기
		System.out.println((row + 1) + " " + (col + 1));
	}

}

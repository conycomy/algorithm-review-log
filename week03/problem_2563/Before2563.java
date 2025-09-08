package week03.problem_2563;

import java.io.*;
import java.util.Scanner;

public class  Before2563 {
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		boolean[][] board = new boolean[100][100];

		int N = sc.nextInt();

		for (int k = 0; k < N; k++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			// 색종이 한 장은 (x..x+9), (y..y+9) 덮음
			for (int yy = y; yy < y + 10; yy++) {
				for (int xx = x; xx < x + 10; xx++) {
					board[yy][xx] = true; // 이미 true여도 그대로 true
				}
			}
		}

		// true인 칸 개수 = 검은 영역 넓이
		int area = 0;
		for (int yy = 0; yy < 100; yy++) {
			for (int xx = 0; xx < 100; xx++) {
				if (board[yy][xx]) area++;
			}
		}
		System.out.println(area);
	}
}
package week03.problem_2563;

import java.io.*;
import java.util.StringTokenizer;


public class After2563 {
	// 도화지 크기, 색종이 한 변 길이 고정
	private static final int SIZE = 100; // 도화지 : 100 * 100
	private static final int PAPER = 10; // 색종이 : 10 * 10
	public static void main(String[] args) throws IOException {
		boolean[][] board = new boolean[SIZE][SIZE]; // board[row][col] = [y][x]

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine()); // 색종이 개수 ( <= 100);

		int area = 0; // 실시간 카운트 : 새로 칠해지는 칸만 증가
		for (int k = 0; k < N; k++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(tokenizer.nextToken()); // 왼쪽에서 x (열, col)
			int y = Integer.parseInt(tokenizer.nextToken()); // 아래에서 y (행, row)

			//색종이 한장은 한변의 길이가 10이니, y+10 해줘야함!
			for( int row = y; row < y+PAPER; row++){ //row = y
				for(int col = x; col < x+PAPER; col++){ //col = x
					if(!board[row][col]){
						board[row][col] = true;
						area++;
					}
				}


			}
		}
		System.out.println(area);

	}

}

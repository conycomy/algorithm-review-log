package week02.problem_3052;

import java.io.*;

public class After3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// [1] 나머지 값은 0~41 범위 → 크기 42
		boolean[] seen = new boolean[42];

		// [2] 입력은 총 10개
		for (int i = 0; i < 10; i++) {
			int x = Integer.parseInt(br.readLine());
			int remainder = x % 42;
			seen[remainder] = true; // 중복은 자동으로 무시됨
		}

		// [3] true로 체크된 칸 개수 세기
		int count = 0;
		for (int i = 0; i < 42; i++) {
			if (seen[i]) {
				count++;
			}
		}

		System.out.println(count);
	}
}
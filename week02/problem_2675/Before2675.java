package week02.problem_2675;

import java.util.Scanner;

public class Before2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int T = sc.nextInt();  // 테스트 케이스 개수

		for (int t = 0; t < T; t++) {
			int R = sc.nextInt();
			String S = sc.next();

			StringBuilder sb = new StringBuilder();

			for(int i = 0; i< S.length(); i++) {
				char c = S.charAt(i);
				for (int j = 0; j < R; j++) {
					sb.append(c);
				}
			}
			System.out.println(sb);

		}
	}
}

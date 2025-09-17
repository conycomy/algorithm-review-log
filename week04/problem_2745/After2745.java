package week04.problem_2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class After2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String N = st.nextToken(); // 진법 수
		int B = Integer.parseInt(st.nextToken());

		int result = 0;
		int power = 1;

		for (int i = N.length() - 1; i >= 0; i--) {
			char ch = N.charAt(i);
			int value;

			if (ch >= '0' && ch <= '9') {
				value = ch - '0';
			} else {
				value = ch - 'A' + 10;
			}

			result += value * power;
			power *= B;
		}
		System.out.println(result);
	}

}

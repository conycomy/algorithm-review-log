package week04.problem_11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class After11005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		br.close();

		if (N == 0) {
			System.out.println("0");
			return;
		}

		StringBuilder sb = new StringBuilder();
		convert(N, B, sb);          // 재귀 호출: 결과는 sb에 앞→뒤 순서로 쌓임
		System.out.println(sb.toString());
	}

	// 재귀: N을 B진법으로 변환하여 sb에 append(앞에서부터)
	private static void convert(long N, int B, StringBuilder sb) {
		if (N == 0) return;                 // 기저: 더 이상 처리할 값이 없으면 종료
		convert(N / B, B, sb);              // 1) 앞쪽(더 높은 자리) 처리
		int digit = (int)(N % B);           // 2) 현재 자리 계산
		sb.append(digitToChar(digit));      // 3) 현재 자리 추가
	}

	private static char digitToChar(int d) {
		return (d < 10) ? (char)('0' + d) : (char)('A' + (d - 10));
	}
}
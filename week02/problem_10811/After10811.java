package week02.problem_10811;

import java.io.*;
import java.util.StringTokenizer;

public class After10811 {

	// 메서드 분리해서 가독성/재사용성 증가
	private static void reverseRange(int[] a, int left, int right) {
		while (left < right) {
			int tmp = a[left];
			a[left] = a[right];
			a[right] = tmp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) throws IOException {
		//Scanner -> BufferReader/BufferedWirter도 바꿔 입 출력 속도 변화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		// 1-basked 배열로 단순화
		int[] basket = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			basket[i] = i;
		}

		for (int t = 0; t < M; t++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			if (i > j) {
				int tmp = i;
				i = j;
				j = tmp;
			}
			reverseRange(basket, i, j);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			if (i > 1) {
				sb.append(' ');
			}
			sb.append(basket[i]);
		}
		bw.write(sb.toString());
		bw.flush();
	}

}

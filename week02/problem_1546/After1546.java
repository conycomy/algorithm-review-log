package week02.problem_1546;

import java.io.*;
import java.util.StringTokenizer;

public class After1546 {
	public static void main(String[] args) throws IOException {
		// 입출력 최적화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] scores = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		int maxScore = 0; // 가독성 있게 변수명 변화
		double adjustSum = 0; // 합은 double

		// 최댓값 + 합 한번에 구하기
		for( int i = 0; i < N; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
			if(scores[i] > maxScore) {
				maxScore = scores[i];
			}
		}

		for (int i = 0; i < N; i++){
			adjustSum += (double) scores[i]/maxScore * 100;
		}

		System.out.println(adjustSum/N);
	}

}

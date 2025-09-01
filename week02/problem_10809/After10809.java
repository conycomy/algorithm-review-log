package week02.problem_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class After10809 {
	public static void main(String[] args) throws IOException {
		// 입출력 최적화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int[] index = new int[26];
		for(int i = 0; i < s.length(); i++) {
			index[i] = -1; // 기본값 -1로 설정
		}

		int found = 0; // 조기 종료 체크
		for( int i = 0; i < s.length(); i++) {
			int k = s.charAt(i) - 'a'; // 직접 매핑
			if(index[k] == -1) {
				index[k] = i;
				found++;
				if (found == 26){
					break; // 모든 알파벳 등장 시 종료한다.
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++){
			if(i>0){
				sb.append(' ');
				sb.append(index[i]);
			}
		}
		System.out.println(sb);
	}
}

package week02.problem_3052;

import java.util.Scanner;

public class Before3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] remainders = new int[10];
		for (int i = 0; i < 10; i++) {
			int x = sc.nextInt();
			remainders[i] = x % 42;
		}

		int count = 0;
		for (int i = 0; i < 10; i++) {
			boolean dup = false;
			for (int j = 0; j < i; j++) {          // 앞쪽에서 이미 나온 적 있는지 확인
				if (remainders[i] == remainders[j]) {
					dup = true;
					break;
				}
			}
			if (!dup) {
				count++;                      // 처음 나온 나머지면 카운트
			}
		}
		System.out.println(count);
	}
}
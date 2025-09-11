package week04.problem_11005;

import java.util.Scanner;

public class Before11005 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt(); // 10진법 수 N
		int B = in.nextInt();

		int count = 0;
		char[] ch = new char[32];
		while ( N > 0 ){
			int MiddleResult = N % B;
			if (MiddleResult < 10) {
				ch[count++] = (char)('0' + (MiddleResult));
			} else {
				ch[count++] = (char)('A' + (MiddleResult - 10));
			}
			N /= B;
		}
		for(int i = count -1; i>=0; i--){
			System.out.print(ch[i]);
		}
	}

}

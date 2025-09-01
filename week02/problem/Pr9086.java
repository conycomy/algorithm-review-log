package week02.problem;

import java.util.Scanner;

public class Pr9086 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		for(int i = 0; i < T; i++) {
			String s = scanner.next();
			char first = s.charAt(0);
			char last = s.charAt(s.length() - 1);

			System.out.println(first + "" + last);

		}
	}

}

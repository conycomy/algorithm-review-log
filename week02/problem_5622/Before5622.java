package week02.problem_5622;

import java.util.Scanner;


public class Before5622 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String alpabet = scanner.next();
		int sum = 0;

		for (int i = 0; i < alpabet.length(); i++) {
			char c = alpabet.charAt(i);

			if ('A' <= c && c <= 'C') {
				sum += 3;      // ABC
			} else if ('D' <= c && c <= 'F') {
				sum += 4; // DEF
			} else if ('G' <= c && c <= 'I') {
				sum += 5; // GHI
			} else if ('J' <= c && c <= 'L') {
				sum += 6; // JKL
			} else if ('M' <= c && c <= 'O') {
				sum += 7; // MNO
			} else if ('P' <= c && c <= 'S') {
				sum += 8; // PQRS
			} else if ('T' <= c && c <= 'V') {
				sum += 9; // TUV
			} else if ('W' <= c && c <= 'Z') {
				sum += 10;// WXYZ
			}

		}
		System.out.println(sum);
	}


}


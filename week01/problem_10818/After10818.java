package week01.problem_10818;

import java.util.Scanner;

public class After10818 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (num > max) max = num;
			if (num < min) min = num;
		}
		System.out.println(min + " " + max);


	}
}



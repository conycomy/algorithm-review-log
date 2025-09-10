package week04;

import java.util.Scanner;

public class problem_2745 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String N = sc.next();
	int B = sc.nextInt();

	int result = 0;
	int num = 1;

	for(int i = N.length() -1; i>=0; i--){
		char ch= N.charAt(i);
		int value = ch - 'A' + 10;
		result += value * num;
		num *= B;
	}

	System.out.println(result);


	}

}

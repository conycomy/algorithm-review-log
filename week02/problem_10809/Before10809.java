package week02.problem_10809;

import java.util.Scanner;

public class Before10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		char[] c = new char[26];
		int[] index = new int[26];
		for(int i = 0; i < c.length; i++) {
			c[i] = (char) ('a' + i);
			index[i] = -1;
		}

		for(int i = 0; i<s.length(); i++){
			char ch = s.charAt(i);

			for(int j = 0; j < c.length; j++){
				if(ch == c[j] && index[j] == -1){
					index[j] = i;
				}
			}
		}

		for(int i = 0; i < index.length; i++){
			System.out.print(index[i]+ " ");
		}

	}
}

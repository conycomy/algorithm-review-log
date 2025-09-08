package week03.problem_10798;

import java.util.Scanner;
public class After10798 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] rows = new String[5];
		for(int i = 0; i<5; i++) {
			rows[i] = scan.nextLine();
		}

	StringBuilder sb = new StringBuilder();
		for(int col = 0; col <15; col++){
			for (int row = 0; row < 5; row++) {
				if(col < rows[row].length()) {
					sb.append(rows[row].charAt(col));
				}
			}
		}
		System.out.println(sb);

	}
}

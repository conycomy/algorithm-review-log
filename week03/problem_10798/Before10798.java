package week03.problem_10798;

import java.util.Scanner;
import java.util.ArrayList;

public class Before10798 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<ArrayList<Character>> matrix = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			ArrayList<Character> row = new ArrayList<>();
			String s = scan.nextLine();
			for (char ch : s.toCharArray()) {
				row.add(ch);
			}
			matrix.add(row);
		}

		for (int i = 0; i < 15; i++) {         // 열: 최대 15
			for (int j = 0; j < 5; j++) {      // 행: 5줄
				if (i < matrix.get(j).size()) {
					System.out.print(matrix.get(j).get(i));
				}
			}


		}



		}


}


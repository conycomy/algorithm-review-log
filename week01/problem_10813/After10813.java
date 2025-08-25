package week01.problem_10813;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class After10813 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();

		List<Integer> bucket = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			bucket.add(i);
		}

		for(int i = 0; i < m; i++) {
			int a = input.nextInt() -1 ;
			int b = input.nextInt() -1 ;
			Collections.swap(bucket, a, b);
		}
		for (int num : bucket) {
			System.out.print(num + " ");

		}
	}
}

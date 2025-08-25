package week01.problem_10810;


import java.util.Scanner;

public class After10810 {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();

		int[] basket = new int[n];

		for(int i = 0; i < m; i++) {
			fillBasket(input, basket);
		}

		printBasket(basket);

	}

		static void fillBasket(Scanner input, int[] basket) {
		int i = input.nextInt() - 1;
		int j = input.nextInt() -1;
		int k = input.nextInt();

		for( int b = i; b <=j; b++){
			basket[b] = k;
		}
	}

		static void printBasket(int[] basket) {
		for(int num : basket) {
			System.out.print(num + " ");
		}
		}

}




package week02.problem_5597;
import java.util.Arrays;
import java.util.Scanner;

public class Before5597 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Students = 30;
		int setTask = 28;
		int[] num = new int[setTask];

		for(int i = 0; i<setTask; i++) {
			num[i] = input.nextInt();
		}
		Arrays.sort(num);

		for( int i = 1; i<=Students; i++) {
			boolean found = false;

			for( int j = 0; j<setTask; j++) {
				if (num[j] == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println(i);
			}
		}
			}

		}





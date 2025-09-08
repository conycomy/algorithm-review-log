package week02.problem_2908;

import java.util.Scanner;

public class Before2908 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A  = scanner.next();
		String B = scanner.next();

		char[] arr = new char[A.length()];
		char[] arr1 = new char[B.length()];
		for(int i = 0; i < A.length(); i++){
			arr[i] = A.charAt(i);
			arr1[i] = B.charAt(i);
		}

		char temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;

		temp = arr1[0];
		arr1[0] = arr1[2];
		arr1[2] = temp;

		String newStr = new String(arr);
		String newStr1 = new String(arr1);

		int num = Integer.parseInt(newStr);
		int num1 = Integer.parseInt(newStr1);

		if(num > num1){
			System.out.println(num);
		} else {
			System.out.println(num1);
		}
	}

}

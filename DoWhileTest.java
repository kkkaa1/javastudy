package ch15;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do {
			System.out.println("num: ");
			input = sc.nextInt();
			sum+= input;
		}while(input !=0);
		System.out.println(sum);
	}

}

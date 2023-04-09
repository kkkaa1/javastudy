package practice1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linecount = sc.nextInt();
		int spacecount = linecount/2+1;
		int starcount=1;
		for(int i=0;i<linecount;i++) {
			for(int j=0; j<spacecount; j++) {
				System.out.print(' ');
				
			}
			for (int j=0; j<starcount;j++ ) {
				System.out.print('*');
			}
			for (int j=0;j<spacecount;j++) {
				System.out.print(' ');
			}
			if (i<linecount/2) {
				spacecount-=1;
				starcount+=2;
				
			}
			else {
				spacecount+=1;
				starcount-=2;
			}
			System.out.println();
		}
		
	}
}

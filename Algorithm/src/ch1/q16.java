package ch1;
//n단의 피라미드를 출력하는 메서드

import java.util.Scanner;

public class q16 {
	
	static void spira(int a) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("n단을 입력하세요");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=(i-1)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}

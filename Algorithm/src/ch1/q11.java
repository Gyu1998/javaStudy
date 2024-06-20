package ch1;
//양의 정수를 입력하고 자릿수 출력
//135 입력 -> '그 수는 3자리입니다'

import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("양의 정수를 입력하세요");
			n = sc.nextInt();
			
		} while(n<=0);
		
		/*
		int count = 1;
		
		do {
			if(n>10)
				count++;
			
			n = n/10;
			
			
		} while(n>10);
		
		System.out.println("그 수는 "+ count +"자리입니다");
		*/
		
		int no = 0; //자릿수
		
		while(n>0) {
			n /= 10;
			no++;
		}
		
		System.out.println("그 수는 " + no + "자리입니다");

	}

}

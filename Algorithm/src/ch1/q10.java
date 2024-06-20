package ch1;
//a, b,에 정수 입력 후 b-a 입력
//b<=a 이면 b값 다시 입력

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a를 입력하세요");
		int a = sc.nextInt();
		
		int b;
		while (true) {
			System.out.println("b를 입력하세요");
			b = sc.nextInt();
			if(b>a) break;
			System.out.println("a보다 큰 수를 입력하세요");
		};
		
		System.out.println("b-a=" + (b-a));
		

	}

}

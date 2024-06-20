package ch1;
//1부터 10까지의 합은 (1+10) * 5 와 같은 가우스의 덧셈을 이용
//1부터 n까지의 정수 합

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 n을 입력하세요");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		
		while(n>=i) {
			
			sum += (i + n);
			i++;
			n--;
				
		}
		System.out.println(sum);
		
		/*
		sum = (i+n)*(n/2);
		System.out.println(sum);
		*/
		
			
	}

}

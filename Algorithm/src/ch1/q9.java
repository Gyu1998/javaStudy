package ch1;
//정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 
//아래 메서드를 작성
//static int sumof(int a, int b)

import java.util.Scanner;

public class q9 {
	
	static int sumof(int a, int b) {
		
		int sum = 0;
		
		//b가 더 클 때
		if(a<b) {
			for(int i = a; i<=b; i++) {
				sum += i;
			}
			return sum;
			
		} else if (a>b){ 
			for(int i = b; i<=a; i++) {
				sum += i;
			}
			return sum;
		} else 
			return a+b;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a 입력");
		int a = sc.nextInt();
		System.out.println("정수 b 입력");
		int b = sc.nextInt();
		
		System.out.println("a와b 사이 정수의 합은 : " + sumof(a, b));

	}

}

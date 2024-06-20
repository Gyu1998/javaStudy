package ch1;
//n이 7이면 1+2+3+4+5+6+7 = 28 로 출력하기

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 n을 입력하세요");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		for(; i<=n; i++) {
			
			sum += i;
			
			if (i!=n) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=" + sum);
			}
		}
			
	}

}

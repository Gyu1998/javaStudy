package ch5;
import java.util.Scanner;
//재귀 없이 gcd 메서드 작성

public class Q2 {
	static int gcd(int x, int y) {
				
		while(y!=0) {
			int t=y;
			y = x%y;
			x = t;
		}
		
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다");
		
		System.out.print("정수를 입력:"); int x = sc.nextInt();
		System.out.print("정수를 입력:"); int y = sc.nextInt();
		
		System.out.println("최대공약수는 " + gcd(x, y) + "입니다");

	}

}

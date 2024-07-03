package ch5;
import java.util.Scanner;
//재귀 메서드 호출 없이 factorial 메서드

public class Q1 {
	static int factorial(int x) {
		int mul = 1;
		
		while(x>0) {
			mul *= x--;	
		}
		return mul;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		int x = sc.nextInt();
		
		System.out.println(x + "의 팩토리얼은" + factorial(x) + "입니다");

	}

}

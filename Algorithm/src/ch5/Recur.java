package ch5;
import java.util.Scanner;

import ch4.IntStack;

public class Recur {

	static void recur(int n) {
		if (n>0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	static void recur2(int n) {
		if (n>0) {
			recur2(n-2);
			System.out.println(n);
			recur2(n-1);
		}
	}
	
	//꼬리 재귀 제거
	static void recur3(int n) {
		while(n>0) {
			recur(n-1);
			System.out.println(n);
			n = n-2;
		}
	}
	
	//스택 사용 꼬리 재귀 제거
	static void recur4(int n) {
		IntStack s = new IntStack(n);
		
		while(true) {
			if (n>0) {
				s.push(n);
				n=n-1;
				continue;
			}
			if(s.isEmpty() != true) {
				 n = s.pop();
				 System.out.println(n);
				 n = n-2;
				 continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 :");
		int x = sc.nextInt();
		
		recur3(x);
	}
}

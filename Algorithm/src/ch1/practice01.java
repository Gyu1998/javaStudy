package ch1;
//네 값의 최댓값을 구하는 max4 메서드를 작성하세요
//네 값의 최솟값을 구하는 min4 메서드를 작성하세요

import java.util.Scanner;

public class practice01 {
	//최댓값
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b>max) max = b;
		if (c>max) max = c;
		if (d>max) max = d;
		
		return max;
	}
	
	//최솟값
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b<min) min = b;
		if (c<min) min = c;
		if (d<min) min = d;
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값:"); int a = sc.nextInt();
		System.out.println("b의 값:"); int b = sc.nextInt();
		System.out.println("c의 값:"); int c = sc.nextInt();
		System.out.println("d의 값:"); int d = sc.nextInt();
		
		System.out.println("4개의 정수 최댓값:" + max4(a, b, c, d));
		System.out.println("4개의 정수 최솟값:" + min4(a, b, c, d));
		
	}

}

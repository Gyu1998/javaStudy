package ch1;
//�� ���� �ִ��� ���ϴ� max4 �޼��带 �ۼ��ϼ���
//�� ���� �ּڰ��� ���ϴ� min4 �޼��带 �ۼ��ϼ���

import java.util.Scanner;

public class practice01 {
	//�ִ�
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b>max) max = b;
		if (c>max) max = c;
		if (d>max) max = d;
		
		return max;
	}
	
	//�ּڰ�
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
		System.out.println("a�� ��:"); int a = sc.nextInt();
		System.out.println("b�� ��:"); int b = sc.nextInt();
		System.out.println("c�� ��:"); int c = sc.nextInt();
		System.out.println("d�� ��:"); int d = sc.nextInt();
		
		System.out.println("4���� ���� �ִ�:" + max4(a, b, c, d));
		System.out.println("4���� ���� �ּڰ�:" + min4(a, b, c, d));
		
	}

}

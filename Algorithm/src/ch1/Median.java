package ch1;
//�� ������ �߾Ӱ� ���ϱ�

import java.util.Scanner;

public class Median {
	
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c) 
				return a;
			else 
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else 
			return b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("�� ������ �߾ư��� ���մϴ�");
		System.out.println("a�� �� : ");
		int a = sc.nextInt();
		System.out.println("b�� �� : ");
		int b = sc.nextInt();
		System.out.println("c�� �� : ");
		int c = sc.nextInt();
		
		System.out.println("�߾Ӱ��� " + med3(a, b, c) + "�Դϴ�");
	}

}

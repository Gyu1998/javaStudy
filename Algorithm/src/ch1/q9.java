package ch1;
//���� a, b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� 
//�Ʒ� �޼��带 �ۼ�
//static int sumof(int a, int b)

import java.util.Scanner;

public class q9 {
	
	static int sumof(int a, int b) {
		
		int sum = 0;
		
		//b�� �� Ŭ ��
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
		
		System.out.println("���� a �Է�");
		int a = sc.nextInt();
		System.out.println("���� b �Է�");
		int b = sc.nextInt();
		
		System.out.println("a��b ���� ������ ���� : " + sumof(a, b));

	}

}

package ch1;
//���� ������ �Է��ϰ� �ڸ��� ���
//135 �Է� -> '�� ���� 3�ڸ��Դϴ�'

import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("���� ������ �Է��ϼ���");
			n = sc.nextInt();
			
		} while(n<=0);
		
		/*
		int count = 1;
		
		do {
			if(n>10)
				count++;
			
			n = n/10;
			
			
		} while(n>10);
		
		System.out.println("�� ���� "+ count +"�ڸ��Դϴ�");
		*/
		
		int no = 0; //�ڸ���
		
		while(n>0) {
			n /= 10;
			no++;
		}
		
		System.out.println("�� ���� " + no + "�ڸ��Դϴ�");

	}

}

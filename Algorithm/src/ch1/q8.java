package ch1;
//1���� 10������ ���� (1+10) * 5 �� ���� ���콺�� ������ �̿�
//1���� n������ ���� ��

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� n�� �Է��ϼ���");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		
		while(n>=i) {
			
			sum += (i + n);
			i++;
			n--;
				
		}
		System.out.println(sum);
		
		/*
		sum = (i+n)*(n/2);
		System.out.println(sum);
		*/
		
			
	}

}

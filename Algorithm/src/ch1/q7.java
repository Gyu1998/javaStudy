package ch1;
//n�� 7�̸� 1+2+3+4+5+6+7 = 28 �� ����ϱ�

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� n�� �Է��ϼ���");
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

package ch1;
//n���� �Ƕ�̵带 ����ϴ� �޼���

import java.util.Scanner;

public class q16 {
	
	static void spira(int a) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("n���� �Է��ϼ���");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=(i-1)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}

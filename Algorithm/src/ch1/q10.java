package ch1;
//a, b,�� ���� �Է� �� b-a �Է�
//b<=a �̸� b�� �ٽ� �Է�

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a�� �Է��ϼ���");
		int a = sc.nextInt();
		
		int b;
		while (true) {
			System.out.println("b�� �Է��ϼ���");
			b = sc.nextInt();
			if(b>a) break;
			System.out.println("a���� ū ���� �Է��ϼ���");
		};
		
		System.out.println("b-a=" + (b-a));
		

	}

}

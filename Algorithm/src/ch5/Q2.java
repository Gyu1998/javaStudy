package ch5;
import java.util.Scanner;
//��� ���� gcd �޼��� �ۼ�

public class Q2 {
	static int gcd(int x, int y) {
				
		while(y!=0) {
			int t=y;
			y = x%y;
			x = t;
		}
		
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ���մϴ�");
		
		System.out.print("������ �Է�:"); int x = sc.nextInt();
		System.out.print("������ �Է�:"); int y = sc.nextInt();
		
		System.out.println("�ִ������� " + gcd(x, y) + "�Դϴ�");

	}

}

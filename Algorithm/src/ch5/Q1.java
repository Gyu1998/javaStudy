package ch5;
import java.util.Scanner;
//��� �޼��� ȣ�� ���� factorial �޼���

public class Q1 {
	static int factorial(int x) {
		int mul = 1;
		
		while(x>0) {
			mul *= x--;	
		}
		return mul;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���:");
		int x = sc.nextInt();
		
		System.out.println(x + "�� ���丮����" + factorial(x) + "�Դϴ�");

	}

}

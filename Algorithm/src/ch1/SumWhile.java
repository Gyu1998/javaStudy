package ch1;
import java.util.Scanner;
// 1, 2, ... n�� ���� ���մϴ�

public class SumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� �� :");
		int n = sc.nextInt();

		int sum = 0;
		int i = 1;
		
		while (i <= n) {    //i�� n ���ϸ� �ݺ���
			sum += i;       //sum�� i�� ����
			i++;            //i�� 1 ����
		}
		System.out.println("1���� n������ ��:" + sum);
	}

}

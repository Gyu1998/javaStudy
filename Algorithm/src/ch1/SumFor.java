package ch1;
import java.util.Scanner;
//1, 2, ... n�� ���� ���մϴ�

public class SumFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("n�� �Է����ּ���");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		for(; i<=n; i++) {  //������ �ʱ�ȭ �߱⿡ �ʱ���� �����
			sum += i;
		}
		System.out.println("1���� n������ ���� :" + sum);

	}

}

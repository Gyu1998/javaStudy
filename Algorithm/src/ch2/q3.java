package ch2;
import java.util.Scanner;
//�迭 a�� ��� ����� �հ踦 ���Ͽ� ��ȯ�ϴ� �޼��� �ۼ�

public class q3 {
	
	static int sumOf(int[] a) {
		int sum = 0;
		
		for (int i=0; i<a.length; i++)
			sum += a[i];
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ���� �Է�");
		int num = sc.nextInt();
		
		int[] a = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("a["+i+"] : ");
			a[i] = sc.nextInt();
		}
			
		System.out.println("����� ��" + sumOf(a));
	}

}

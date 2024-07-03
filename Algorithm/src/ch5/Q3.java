package ch5;
import java.util.Scanner;
//�迭 a�� ��� ����� �ִ������� ���ϱ�

public class Q3 {
	
	static int gcdArray(int[] a) {
		int r = a[0];
		for(int i=1; i<a.length; i++) {
			r = gcd(r, a[i]);
		}
		return r;
	}
	
	static int gcd(int x, int y) {
		if(y == 0)
			return x;
		else
			return gcd(y, x%y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭 a�� ��� ����� �ִ����� ���ϱ�");
		System.out.print("��ڰ�:");
		int nx = sc.nextInt();
		
		int[] a = new int[nx];
		for(int i=0; i<a.length; i++) {
			System.out.print("x["+i+"]:");
			a[i] = sc.nextInt();
		}
		
		int result = gcdArray(a);
		
		System.out.println("�迭 a�� �ִ������� " + result);

	}

}

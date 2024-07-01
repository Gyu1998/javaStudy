package ch6;
import java.util.Scanner;
//�ܼ� ���� ����

public class InsertionSort {
	
	//�ܼ� ���� ����
	static void insertionSort(int[] a, int n) {
		for(int i=1; i<n; i++) {
			int j;
			int tmp = a[i];
			for(j=i; j>0 && a[j-1] > tmp; j--)
				a[j] = a[j-1];
			a[j] = tmp;
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("��ڼ� �Է�:");
		int n = sc.nextInt();      //��ڼ�
		int[] x = new int[n];
		
		System.out.println("�迭�� ���� �Է����ּ���");
		for(int i=0; i<n; i++) {
			System.out.println("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		insertionSort(x, n);
		
		System.out.println("���");
		for (int i=0; i<n; i++)
			System.out.println("x[" + i + "]=" + x[i] );
		
	}

}

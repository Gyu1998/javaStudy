package ch6;
import java.util.Scanner;
//���� ����(���� 1)

public class BubbleSort {
	
	//a[idx1]�� a[idx2]�� ���� �ٲߴϴ�
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//���� ����
	static void bubbleSort(int[] a, int n) {
		for (int i=0; i<n-1; i++)
			for(int j=n-1; j>i; j--)
				if(a[j-1] > a[j])
					swap(a, j-1, j);
	}
	
	//���ʺ��� ����
	static void bubbleSortLeft(int[]a, int n) {
		for(int i=0; i<n-1; i++)
			for(int j=0; j<n-1-i; j++)
				if(a[j] > a[j+1])
					swap(a, j, j+1);
	}
	
	//���� ����(���� 2)
	static int bubbleSort2(int[] a, int n) {
		int exchg = 0; 
		for (int i=0; i<n-1; i++) {
			           //�н��� ��ȯ Ƚ��
			for(int j=n-1; j>i; j--)
				if (a[j-1] > a[j]) {
					swap(a, j-1, j);
					exchg++;
				}
			if(exchg == 0) break;     //��ȯ ������ ����
		}
		
		return exchg;
	}
	
	//���� ����(����3)
	static void bubbleSort3(int[] a, int n) {
		int k = 0;                 //a[k]���� ������ ������ ��ģ ����
		while(k<n-1) {
			int last = n-1;        //���������� ��Ҹ� ��ȯ�� ��ġ
			for(int j=n-1; j>k; j--)
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
					last = j;
				}
			k=last;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ����(���� 1)");
		System.out.print("��ڼ�: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for (int i=0; i<nx; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sc.nextInt();
		}
		
		/*
		bubbleSort(x, nx);        //�迭 x�� ���� ����
		
		System.out.println("������������ ������");
		for (int i=0; i<nx; i++)
			System.out.println("x[" + i + "]=" + x[i]);
		*/
		
		//bubbleSortLeft(x, nx);
		bubbleSort3(x, nx);
		
		System.out.println("���ʺ��� ������");
		for (int i=0; i<nx; i++)
			System.out.println("x[" + i + "]=" + x[i] );
		//System.out.println("�н� �õ� Ƚ��: " + exc);
		
		

	}

}

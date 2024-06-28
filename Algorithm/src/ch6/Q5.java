package ch6;
import java.util.Scanner;
//Ĭ���� ����

public class Q5 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx2];
		a[idx2] = a[idx1];
		a[idx1] = t;
	}
	
	
	
	static void cocktail(int[] a, int n) {   
		
		for(int i=0; i<n-1; i++) {
			if(i%2 == 0) {            //���� ���� ������
				for(int j=n-1-i/2; j>i/2; j--) {
					if(a[j-1] > a[j]) {
						swap(a, j-1, j);
					}
				}	
			}
			else {                    //ū ���� �ڷ�
				for(int k=i/2+1; k<n-i/2-1; k++) {
					if(a[k] > a[k+1])
						swap(a, k, k+1);
				}
				
			}
		}
		
	}
	
	
	//--- ����� ���� ����(����Ŀ ����)---//
	static void shakerSort(int[] a, int n) {
		int left = 0;
		int right = n - 1;
		int last = right;

		while (left < right){
			for (int j = right; j > left; j--){
				if (a[j - 1] > a[j]){
					swap(a, j - 1, j);
					last = j;
				}
			}
			left = last;

			for (int j = left; j < right; j++){
				if (a[j] > a[j + 1]){
					swap(a, j, j + 1);
					last = j;
				}
			}
			right = last;
		}
	}
		
	//�ܼ� ���� ����
	static void selectionSort(int[] a, int n) {
		for (int i=0; i<n-1; i++) {
			int min = i;         //���� ���ĵ��� ���� �κп��� ���� ���� ����� �ε���
			for(int j=i+1; j<n; j++)
				if(a[j] < a[min])
					min = j;
			swap(a, i, min);    //���� ���ĵ��� ���� �κ��� ù ��ҿ� ���� ���� ��� ��ȯ
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ڼ� �Է�:");
		int n = sc.nextInt();      //��ڼ�
		int[] x = new int[n];
		
		System.out.println("�迭�� ���� �Է����ּ���");
		for(int i=0; i<n; i++) {
			System.out.println("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		cocktail(x, n);
		
		System.out.println("���");
		for (int i=0; i<n; i++)
			System.out.println("x[" + i + "]=" + x[i] );
		
	}

}

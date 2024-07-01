package ch6;
import java.util.Scanner;

public class Q10 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void quickSort(int[] a, int n) {
		int left = n-n;
		int right = n;
		
		int pl = left;               //left
		int pr = right;             //right
		int x = a[(pl+pr)/2];     //�ǹ�
		
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl<=pr)
				swap(a, pl++, pr--);
		} while(pl <= pr);
		/*
		if(pl < x) quickSort(a, x);
		if(x<pr) quickSort(a, pr-x);
		*/
		if (left < pr) quickSort(a, pr);  // ���� �κ�
        if (pl < right) quickSort(a, right-pl); // ������ �κ�
		
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("�� ����");
	System.out.print("��ڼ�:");
	int nx = sc.nextInt();
	int[] x = new int[nx];
	
	for(int i=0; i<nx; i++) {
		System.out.print("x[" + i + "]:");
		x[i] = sc.nextInt();
	}
	
	quickSort(x, nx-1);
	
	System.out.println("������������ ����");
	for(int i=0; i<nx; i++)
		System.out.println("xp" + i + "]=" + x[i]);

	}

}

package ch6;
//요소 개수 9개 이하면 단순 삽입 정렬

import java.util.Scanner;

public class Q13 {
	
	static void insertionSort(int[] a, int n) {
		for(int i=1; i<n; i++) {
			int j;
			int tmp = a[i];
			for(j=i; j>0 && a[j-1]>tmp; j--) 
				a[j] = a[j-1];
			 a[j] = tmp;
		}
		System.out.println("삽입 정렬 마침");
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl+pr)/2];
		
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl <= pr)
				swap(a, pl++, pr--);
		} while(pl <= pr);
		
		if(left < pr) quickSort(a, left, pr);
		if(pl < right) quickSort(a, pl, right);
		System.out.println("퀵 정렬 마침");
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			
			System.out.println("퀵 정렬");
			System.out.print("요솟수:");
			int nx = sc.nextInt();
			int[] x = new int[nx];
			
			for(int i=0; i<nx; i++) {
				System.out.print("x[" + i + "]:");
				x[i] = sc.nextInt();
			}
			
			if(nx <= 9) 
				insertionSort(x, nx);
			else
				quickSort(x, 0, nx-1);
			
			System.out.println("오름차순으로 정렬");
			for(int i=0; i<nx; i++)
				System.out.println("xp" + i + "]=" + x[i]);

	}

}



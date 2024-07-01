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
		int x = a[(pl+pr)/2];     //피벗
		
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
		if (left < pr) quickSort(a, pr);  // 왼쪽 부분
        if (pl < right) quickSort(a, right-pl); // 오른쪽 부분
		
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
	
	quickSort(x, nx-1);
	
	System.out.println("오름차순으로 정렬");
	for(int i=0; i<nx; i++)
		System.out.println("xp" + i + "]=" + x[i]);

	}

}

package ch6;
import java.util.Scanner;
//큰 값을 끝으로

public class Q1 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t; 
	}
	
	static void bubbleSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(a[j] > a[j+1])
					swap(a, j, j+1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요솟수");
		int nx = sc.nextInt();
		
		int[] x = new int[nx];
		for(int i=0; i<nx; i++) {
			System.out.println("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, nx);
		
		for(int i=0; i<nx; i++)
			System.out.println("x["+i+"]= " + x[i]);

	}

}

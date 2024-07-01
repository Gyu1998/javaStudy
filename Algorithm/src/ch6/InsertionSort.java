package ch6;
import java.util.Scanner;
//단순 삽입 정렬

public class InsertionSort {
	
	//단순 삽입 정렬
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
		System.out.println("요솟수 입력:");
		int n = sc.nextInt();      //요솟수
		int[] x = new int[n];
		
		System.out.println("배열에 값을 입력해주세요");
		for(int i=0; i<n; i++) {
			System.out.println("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		insertionSort(x, n);
		
		System.out.println("결과");
		for (int i=0; i<n; i++)
			System.out.println("x[" + i + "]=" + x[i] );
		
	}

}

package ch6;
import java.util.Scanner;
//a[0]을 보초로 삽입

public class Q7 {
	
	static void selectSort(int[] a, int nx) {
		
		for (int i = 2; i < nx; i++) { //nx == n+1
			int tmp = a[0] = a[i];
			int j = i;
			
			for ( ; a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			if (j > 0) a[j] = tmp;
		}
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요솟수 입력:");
		int n = sc.nextInt();      //요솟수
		int[] x = new int[n+1];
		
		System.out.println("배열에 값을 입력해주세요");
		for(int i=1; i<n; i++) {
			System.out.println("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		selectSort(x, n+1);
		
		System.out.println("결과");
		for (int i=1; i<n; i++)
			System.out.println("x[" + i + "]=" + x[i] );

	}

}

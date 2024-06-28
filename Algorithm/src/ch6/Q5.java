package ch6;
import java.util.Scanner;
//칵테일 정렬

public class Q5 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx2];
		a[idx2] = a[idx1];
		a[idx1] = t;
	}
	
	
	
	static void cocktail(int[] a, int n) {   
		
		for(int i=0; i<n-1; i++) {
			if(i%2 == 0) {            //작은 값을 앞으로
				for(int j=n-1-i/2; j>i/2; j--) {
					if(a[j-1] > a[j]) {
						swap(a, j-1, j);
					}
				}	
			}
			else {                    //큰 값을 뒤로
				for(int k=i/2+1; k<n-i/2-1; k++) {
					if(a[k] > a[k+1])
						swap(a, k, k+1);
				}
				
			}
		}
		
	}
	
	
	//--- 양방향 버블 정렬(셰이커 정렬)---//
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
		
	//단순 선택 정렬
	static void selectionSort(int[] a, int n) {
		for (int i=0; i<n-1; i++) {
			int min = i;         //아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스
			for(int j=i+1; j<n; j++)
				if(a[j] < a[min])
					min = j;
			swap(a, i, min);    //아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소 교환
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요솟수 입력:");
		int n = sc.nextInt();      //요솟수
		int[] x = new int[n];
		
		System.out.println("배열에 값을 입력해주세요");
		for(int i=0; i<n; i++) {
			System.out.println("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		cocktail(x, n);
		
		System.out.println("결과");
		for (int i=0; i<n; i++)
			System.out.println("x[" + i + "]=" + x[i] );
		
	}

}

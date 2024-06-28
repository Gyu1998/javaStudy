package ch6;
import java.util.Scanner;
//이진 검색 사용

public class Q8 {
	
	static void insertionSort(int[] a, int n) {
		for(int i=1; i<n; i++) {
			int key = a[i];
			int pl = 0;             //검색 범위 맨 앞 인덱스
			int pr = i-1;           //검색 범위 맨 끝 인덱스
			int pc;                 //중앙 인덱스
			int pd;                 //삽입 위치
			
			do {
				pc = (pl+pr)/2;
				if(a[pc] == key)
					break;
				else if(a[pc] < key)
					pl = pc + 1;
				else 
					pr = pc - 1;
			} while(pl<=pr);
			
			pd = (pl <= pr) ? pc +1 : pr+1;
			
			for (int j=i; j>pd; j--)
				a[j] = a[j-1];
			a[pd] = key;
	
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
		
		insertionSort(x, n);
		
		System.out.println("결과");
		for (int i=0; i<n; i++)
			System.out.println("x[" + i + "]=" + x[i] );

	}

}

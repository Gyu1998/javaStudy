package ch3;

import java.util.Scanner;
//while -> for문으로

public class q1 {
	
	//요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
		static int seqSearchSen(int[] a, int n, int key) {
			
			a[n] = key;      //보초 추가
			
			for(int i=0; i<n; i++) {
				if(a[i] == key)
					return i;
			}
			return -1;
		}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			
			System.out.println("요솟수:");
			int num = sc.nextInt();
			int[] x = new int[num+1];   //요솟수 num+1(보초용)
			
			for (int i=0; i<num; i++) {
				System.out.print("x["+i+"]:");
				x[i] = sc.nextInt();
			}
			
			System.out.print("검색할 값:");
			int ky = sc.nextInt();
			
			int idx = seqSearchSen(x, num, ky);
			
			if(idx==-1)
				System.out.println("그 값의 요소가 없음");
			
			else
				System.out.println(ky+"은 x[" + idx + "]에 있음");
		}
		

}

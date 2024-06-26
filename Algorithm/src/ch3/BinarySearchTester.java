package ch3;
import java.util.Scanner;
import java.util.Arrays;
//Arrays.binarySearch로 이진 검색
//q6 삽입요소 출력하게 수정

public class BinarySearchTester {
	
	static int insertI(int[] a, int n, int k) {
		int pl = 0;
		int pr = n-1;
		int pc = 0;
		
		
		do {
			pc = (pl + pr) / 2;
			if(a[pc] < k)
				pl = pc+1;
			else if (a[pc] > k)
				pr = pc-1;
		
		} while(pl <= pr);
		
		int sab = -pr - 1;
		
		
		return sab;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수:");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.print("x[0]:");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i + "]:");
				x[i] = sc.nextInt();
			} while (x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값:");
		int ky = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0) {
			/*
			System.out.println("그 값의 요소가 없음");
			int insertIdx = insertI(x, num, ky);
			System.out.println("삽입 포인트:" + insertIdx);
			*/
			int insPoint = -idx - 1;
			System.out.println("그 값의 요소는 존재하지 않습니다.");
			System.out.printf("삽입 포인트는 %d입니다.\n", insPoint);
			System.out.printf("x[%d]의 바로 앞에 %d을(를) 삽입하면 배열의 정렬상태가 유지됩니다.", insPoint, ky);
		}		
		else 
			System.out.println(ky + "은 x[" + idx + "]에 있음");
	}
	
	

}

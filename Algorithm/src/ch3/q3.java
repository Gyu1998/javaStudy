package ch3;
import java.util.Scanner;

public class q3 {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		
		a[n] = key;
		int j=0;
		
		
		for(int i=0; i<n; i++) {
			if(a[i] == key) {
				idx[j++] = a[i];
				
			}
		}
		
		return j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟값");
		int num = sc.nextInt();
		
		int[] x = new int[num+1];         //요솟수 n인 배열
		System.out.print("x[0]:");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
			} while(x[i] < x[i-1]);
		} 
		
		System.out.println("찾을 값");
		int key = sc.nextInt();
		
		int[] idx = new int[num];
		
		
		int idxCnt = searchIdx(x, num, key, idx);
		
		System.out.println(key + "와 일치하는 요수 갯수: " + idxCnt);
		
	}

}

package ch3;
import java.util.Scanner;
//과정 출력

public class q2 {
	
	static int search(int[] a, int n, int key) {
		
		//a[n] = key;
		
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
		System.out.println();
		
		int[] x = new int[num];
		System.out.print("x[0]:");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"]:");
				x[i] = sc.nextInt();
			} while(x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값:");
		int ky = sc.nextInt();
		
		int idx = search(x, num, ky);
		
		
		
		System.out.print("   |");
		for(int i=0; i<num; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("---+---------------");
		
		for(int i=0; i<=num; i++) {
			System.out.print("   |");
				if(idx >= i) {
					for(int j=0; j<(3*i)+2; j++) {
						System.out.print(" ");
					}
					System.out.print("*");
				}
			
			System.out.println();
			System.out.print("  " + i + "|");
				for(int j=0; j<num; j++)
					System.out.printf("%3d", x[j]);
			
			
			System.out.println();
			System.out.println("   |");
			
		}
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없음");
		else
			System.out.println(ky+"은 x[" + idx + "]에 있음");

	}

}

package ch2;
import java.util.Scanner;
//역순 정렬하는 과정을 다 나타내기

public class q2 {
	
	static void reverse(int[] a) {
		for(int i=0; i<a.length /2; i++) {
			//System.out.println("a["+ i + "]과 a[" + (a.length-1) + "를 교환합니다");
			System.out.printf("a[%d]과 a[%d]를 교환합니다%n", i, a.length - 1);
			swap(a, i, a.length-i-1);
			
			
			
			for(int j=0; j<a.length; j++) {
				System.out.printf("%3d", a[j]);
				
			} System.out.println();
		}
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("요솟수를 입력하세요");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("값을 입력하세요");
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			System.out.printf("%3d", x[i]);
		}
		System.out.println();
		
		reverse(x);
		
        System.out.println("역순 정렬 마침");
		
	}

}

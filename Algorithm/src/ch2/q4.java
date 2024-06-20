package ch2;
import java.util.Scanner;
//배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성

public class q4 {
	
	static void copy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("배열 b 요솟수");
		int nb = sc.nextInt();
		
		int[] b = new int[nb];
		
		for(int i=0; i<nb; i++) {
			System.out.println("b["+i+"] : ");
		    b[i] = sc.nextInt();
		}
		
		int[] a = new int[nb];
		    
		copy(a, b);
		
		System.out.println("배열 a");
		for(int i=0; i<a.length; i++) {
			System.out.printf("b의 값: %3d\n", b[i]);
			System.out.printf("a의 값: %3d\n", a[i]);
		}
		
	}

}

package ch2;
import java.util.Scanner;
//배열 요소에 값을 읽어 들여 역순으로 정렬합니다

public class ReverseArray {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for (int i=0; i<a.length /2; i++)
			swap(a, i, a.length -i -1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소룰 역순으로 정렬했습니다.");
		for(int i=0; i<num; i++)
			System.out.println("x[" + i + "] = " + x[i]);

	}

}

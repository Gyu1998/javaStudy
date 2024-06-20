package ch2;
import java.util.Scanner;
//배열 a의 모든 요소의 합계를 구하여 반환하는 메서드 작성

public class q3 {
	
	static int sumOf(int[] a) {
		int sum = 0;
		
		for (int i=0; i<a.length; i++)
			sum += a[i];
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("요소 개수 입력");
		int num = sc.nextInt();
		
		int[] a = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("a["+i+"] : ");
			a[i] = sc.nextInt();
		}
			
		System.out.println("요소의 합" + sumOf(a));
	}

}

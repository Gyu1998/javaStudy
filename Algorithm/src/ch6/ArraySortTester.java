package ch6;
import java.util.Arrays;
import java.util.Scanner;
//Arrays.sort �޼��带 ����Ͽ� ����(�� ����)

public class ArraySortTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ�:");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for (int i=0; i<num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sc.nextInt();
		}
		
		Arrays.sort(x);
		
		System.out.println("������������ �����߽��ϴ�");
		for(int i=0; i<num; i++) 
			System.out.println("x[" + i + "]=" + x[i]);
	}

}

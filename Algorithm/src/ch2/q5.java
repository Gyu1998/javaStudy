package ch2;
import java.util.Scanner;
//�迭 b�� ��� ��Ҹ� �迭 a�� �������� �����ϴ� �޼��� rcopy

public class q5 {
	
	static void rcopy(int[] a, int[] b) {
		for(int i=0; i<=b.length-1; i++) {
			a[i] = b[b.length-1-i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("�迭 b ��Ҽ�");
		int bnum = sc.nextInt();
		
		int[] b = new int[bnum];
		int[] a = new int[bnum];
		
		for(int i=0; i<bnum; i++) {
			System.out.println("b["+i+"] : ");
			b[i] = sc.nextInt();
		}
		for(int i=0; i<bnum; i++) {
			System.out.printf("�迭 a :%3d", + a[i]);
		}
		
		System.out.println();
		rcopy(a, b);
		
		for(int i=0; i<bnum; i++) {
			System.out.printf("�迭 b :%3d  ", + b[i]);
			
			System.out.printf("�迭 a :%3d", + a[i]);
			System.out.println();
		}
		
	}

}

package ch2;
import java.util.Scanner;
//�迭 b�� ��� ��Ҹ� �迭 a�� �����ϴ� �޼��� copy�� �ۼ�

public class q4 {
	
	static void copy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("�迭 b ��ڼ�");
		int nb = sc.nextInt();
		
		int[] b = new int[nb];
		
		for(int i=0; i<nb; i++) {
			System.out.println("b["+i+"] : ");
		    b[i] = sc.nextInt();
		}
		
		int[] a = new int[nb];
		    
		copy(a, b);
		
		System.out.println("�迭 a");
		for(int i=0; i<a.length; i++) {
			System.out.printf("b�� ��: %3d\n", b[i]);
			System.out.printf("a�� ��: %3d\n", a[i]);
		}
		
	}

}

package ch2;
import java.util.Scanner;
//���� �����ϴ� ������ �� ��Ÿ����

public class q2 {
	
	static void reverse(int[] a) {
		for(int i=0; i<a.length /2; i++) {
			//System.out.println("a["+ i + "]�� a[" + (a.length-1) + "�� ��ȯ�մϴ�");
			System.out.printf("a[%d]�� a[%d]�� ��ȯ�մϴ�%n", i, a.length - 1);
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
		System.out.println("��ڼ��� �Է��ϼ���");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("���� �Է��ϼ���");
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			System.out.printf("%3d", x[i]);
		}
		System.out.println();
		
		reverse(x);
		
        System.out.println("���� ���� ��ħ");
		
	}

}

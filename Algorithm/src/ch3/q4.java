package ch3;
import java.util.Scanner;

public class q4 {
	
	static int search(int[] a, int n, int ky) {
		int pl = 0;
		int pr = n-1;
		int pc = (pl+pr)/2;
		
		
		System.out.print("   |");
		for(int i=0; i<n; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		System.out.print("---+");
		for(int i=0; i<3*n; i++) 
			System.out.print("-");
		System.out.println();
				
		for(int i=0; i<n; i++) {
			System.out.print("   |");
			
			System.out.println();
			
			System.out.printf("%3d", pc);
			System.out.printf("%3d", i);
		}
		
		do {
			pc = (pl+pr)/2;
			if(a[pc] == ky)
				return pc;
			else if (a[pc] < ky)
				pl = pc +1;
			else 
				pr = pc -1;
		} while(pl <= pr);
		
		
		return -1;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int[] x = new int[num];				// ��ڼ��� num �� �迭 

		System.out.println("������������ �Է��ϼ���.");

		System.out.print("x[0] : ");		// �Ǿ� ��Ҹ� �Է¹���
		x[0] = sc.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);	// �ٷ� ���� ��Һ��� ������ �ٽ� �Է� ����
		}
		
		System.out.print("�˻� �� : ");			// Ű���� �Է¹���
		int ky = sc.nextInt();
		
		int idx = search(x, num, ky);	// �迭 x���� ���� ky�� ��Ҹ� �˻�

		if (idx == -1)
			System.out.println("�� ���� ��Ҵ� �������� �ʽ��ϴ�.");
		else
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");

	}

}

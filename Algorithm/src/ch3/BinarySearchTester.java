package ch3;
import java.util.Scanner;
import java.util.Arrays;
//Arrays.binarySearch�� ���� �˻�
//q6 ���Կ�� ����ϰ� ����

public class BinarySearchTester {
	
	static int insertI(int[] a, int n, int k) {
		int pl = 0;
		int pr = n-1;
		int pc = 0;
		
		
		do {
			pc = (pl + pr) / 2;
			if(a[pc] < k)
				pl = pc+1;
			else if (a[pc] > k)
				pr = pc-1;
		
		} while(pl <= pr);
		
		int sab = -pr - 1;
		
		
		return sab;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ�:");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է��ϼ���");
		
		System.out.print("x[0]:");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i + "]:");
				x[i] = sc.nextInt();
			} while (x[i] < x[i-1]);
		}
		
		System.out.print("�˻��� ��:");
		int ky = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0) {
			/*
			System.out.println("�� ���� ��Ұ� ����");
			int insertIdx = insertI(x, num, ky);
			System.out.println("���� ����Ʈ:" + insertIdx);
			*/
			int insPoint = -idx - 1;
			System.out.println("�� ���� ��Ҵ� �������� �ʽ��ϴ�.");
			System.out.printf("���� ����Ʈ�� %d�Դϴ�.\n", insPoint);
			System.out.printf("x[%d]�� �ٷ� �տ� %d��(��) �����ϸ� �迭�� ���Ļ��°� �����˴ϴ�.", insPoint, ky);
		}		
		else 
			System.out.println(ky + "�� x[" + idx + "]�� ����");
	}
	
	

}

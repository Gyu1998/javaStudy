package ch3;
import java.util.Scanner;
//���� �˻� �� ���ϰ� �� �տ� ã��

public class Q5 {
	
	static int binSearchX(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		int pc;
		
		do {
			pc = (pl+pr)/2;
			if(a[pc] == key)
				break;
			else if(a[pc] < key)
				pl = pc+1;
			else
				pr = pc-1;
		} while(pl <= pr);
		
		if(pl > pr)   //���� ����
			return -1;
		
		for(int i=pc-1; i>=0; i--) {
			if(a[i] != key)
				return i+1;
		}
		return pc;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ڼ�:");
		int nx = sc.nextInt();
		
		int[] x = new int[nx];
		
		System.out.print("x[0] : ");		// �Ǿ� ��Ҹ� �Է¹���
		x[0] = sc.nextInt();

		for (int i = 1; i < nx; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);	// �ٷ� ���� ��Һ��� ������ �ٽ� �Է� ����
		}
		
		System.out.println("ã�� ��");
		int key = sc.nextInt();
			
		int find = binSearchX(x, nx, key);
		
		System.out.println("x��[" +find+ "] (-1�� �� ����)");
		
		
	}

}

package ch6;
import java.util.Scanner;
//���� �˻� ���

public class Q8 {
	
	static void insertionSort(int[] a, int n) {
		for(int i=1; i<n; i++) {
			int key = a[i];
			int pl = 0;             //�˻� ���� �� �� �ε���
			int pr = i-1;           //�˻� ���� �� �� �ε���
			int pc;                 //�߾� �ε���
			int pd;                 //���� ��ġ
			
			do {
				pc = (pl+pr)/2;
				if(a[pc] == key)
					break;
				else if(a[pc] < key)
					pl = pc + 1;
				else 
					pr = pc - 1;
			} while(pl<=pr);
			
			pd = (pl <= pr) ? pc +1 : pr+1;
			
			for (int j=i; j>pd; j--)
				a[j] = a[j-1];
			a[pd] = key;
	
		}
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ڼ� �Է�:");
		int n = sc.nextInt();      //��ڼ�
		int[] x = new int[n];
		
		System.out.println("�迭�� ���� �Է����ּ���");
		for(int i=0; i<n; i++) {
			System.out.println("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		insertionSort(x, n);
		
		System.out.println("���");
		for (int i=0; i<n; i++)
			System.out.println("x[" + i + "]=" + x[i] );

	}

}

package ch3;

import java.util.Scanner;
//while -> for������

public class q1 {
	
	//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻��մϴ�.
		static int seqSearchSen(int[] a, int n, int key) {
			
			a[n] = key;      //���� �߰�
			
			for(int i=0; i<n; i++) {
				if(a[i] == key)
					return i;
			}
			return -1;
		}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			
			System.out.println("��ڼ�:");
			int num = sc.nextInt();
			int[] x = new int[num+1];   //��ڼ� num+1(���ʿ�)
			
			for (int i=0; i<num; i++) {
				System.out.print("x["+i+"]:");
				x[i] = sc.nextInt();
			}
			
			System.out.print("�˻��� ��:");
			int ky = sc.nextInt();
			
			int idx = seqSearchSen(x, num, ky);
			
			if(idx==-1)
				System.out.println("�� ���� ��Ұ� ����");
			
			else
				System.out.println(ky+"�� x[" + idx + "]�� ����");
		}
		

}

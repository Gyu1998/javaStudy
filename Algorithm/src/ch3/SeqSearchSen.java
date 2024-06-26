package ch3;
import java.util.Scanner;
//���� �˻� ���ʹ�

public class SeqSearchSen {
	
	//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻��մϴ�.
	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		
		a[n] = key;      //���� �߰�
		
		while(true) {
			if (a[i] == key)  //�˻� ����
				break;
			i++;
		}
		return i == n? -1 : i;
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

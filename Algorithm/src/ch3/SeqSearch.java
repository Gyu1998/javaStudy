package ch3;
import java.util.Scanner;
//�����˻�

public class SeqSearch {
	
	static int seqSearch(int[] a, int n, int key) {
		int i=0;
		
		while (true) {
			if (i ==n)
				return -1; //�˻� ����!(-1�� ��ȯ)
			if (a[i] == key) 
				return i;  //�˻� ����!(�ε��� ��ȯ)
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ڼ�:");
		int num = sc.nextInt();
		int[] x = new int[num];       //��ڼ��� num�� �迭
		
		for (int i=0; i<num; i++) {
			System.out.println("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		System.out.println("�˻��� ��:"); //Ű ���� �Է�
		int ky = sc.nextInt();
		
		int idx = seqSearch(x, num, ky); //�迭 x���� Ű ���� ky�� ���
		
		if (idx == -1)
			System.out.println("�ش� ��Ұ� ����");
		else
			System.out.println(ky + "�� x[" + idx + "]�� ����"
					+ "");

	}

}

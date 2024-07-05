package ch5;
//�� ��, ���� 1���� ���� ��ġ�ϴ� ������ ��������� ����

public class QueenBB {
	
	static boolean[] flag = new boolean[8];   //�� �࿡ ���� ��ġ�ߴ��� üũ
	static int[] pos = new int[8];            //�� ���� ���� ��ġ
	
	//�� ���� ���� ��ġ ���
	static void print() {
		for (int i=0; i<3; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	static void set(int i) {
		for(int j=0; j<3; j++) {
			if (flag[j] == false) {   //j�࿡�� ���� ���� ��ġ ��������
				pos[i] = j;           //���� j�࿡ ��ġ
				if(i==2)              //��� ���� ��ġ�� ���
					print();
				else {
					flag[j] = true;
					set(i+1);
					flag[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		set(0);

	}

}

package ch5;
//�� ���� 1���� ���� ��ġ�ϴ� ������ ����� ����

public class QueenB {
	
	static int[] pos = new int[3];       //�� ���� ���� ��ġ
	
	//�� ���� ���� ��ġ�� ���
	static void print() {
		for (int i=0; i<3; i++) 
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	//i���� ���� �����ϴ�
	static void set(int i) {
		for (int j=0; j<3; j++) {
			pos[i] = j;         //���� j�࿡ ��ġ
			if(i==2)
				print();
			else
				set(i+1);       //���� ���� ���� ��ġ
		}
	}
	
	public static void main(String[] args) {
		set(0);                 //0���� �� ��ġ
	}

}

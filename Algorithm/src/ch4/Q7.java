package ch4;

import ch4.IntQueue.EmptyIntQueueException;

public class Q7 {
	private int max;           //ť�� �뷮
	private int num;           //���� ������ ��
	private int[] que;         //ť ��ü
	
	private int frontA;        //a���� ù ��° ��� Ŀ��
	private int rearA;         //a���� ������ ��� Ŀ��
	
	private int frontB;        //b���� ù ��° ��� Ŀ��
	private int rearB;         //b���� ������ ��� Ŀ��
	
	//���� �� ���� : ť�� ��� ����
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//���� �� ���� : ť�� ���� ��
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	//������
	public Q7(int capacity) {
		max = capacity;
		num = frontA = rearA = 0;        //a���� ť
		frontB = rearB = max -1;         //b���� ť
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {   //������ �� ����
			max = 0;
		}	
	}
	
	//a���� ��ť
	public int endequeA(int x) {
		if(num >= max)
			throw new OverflowIntQueueException();
		que[rearA++] = x;
		num++;
		if(rearA >= rearB)
			rearA = 0;
		return x;
			
	}
	
	//a���� ��ť
	public int dequeA() {
		if(num <= 0)
			throw new EmptyIntQueueException();       //ť�� ��� ����
		int x = que[frontA++];
		num--;
		if(frontA >=rearB)
			frontA = 0;
		return x;
	}
	
	//b���� ��ť
	public int endequeB(int x) {
		if(num >= max)
			throw new OverflowIntQueueException();
		que[rearB--] = x;
		num++;
		if(rearB <= rearA)
			rearB = max-1;
		return x;
			
	}
	
	//b���� ��ť
	public int dequeB() {
		if(num <= 0)
			throw new EmptyIntQueueException();       //ť�� ��� ����
		int x = que[frontB--];
		num--;
		if(frontB <= rearA)
			frontA = 0;
		return x;
	}
	
	
	
	

}

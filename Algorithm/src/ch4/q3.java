package ch4;
import java.util.Scanner;
//�ϳ��� �迭�� �����Ͽ� 2���� ������ �����ϴ� int�� �����Ϳ� ����

public class q3 {
	
	private static int[] stk;   //���� ��ü
	private static int maxSize; //���� ��ü �뷮
	
	static class StackA {
		private int ptrA;     //A���� ������
		
		public StackA() {
			ptrA = 0;
		}
		
		public int push(int x) {
			if(ptrA >= maxSize / 2)
				throw new OverflowIntStackException();
			return stk[ptrA++] = x;
		}
		
		public int pop() {
			if(ptrA <= 0)
				throw new EmptyIntStackException();
			return stk[--ptrA];
		}
	}
	
	static class StackB {
		private int ptrB;     //B���� ������
		
		public StackB() {
			ptrB = maxSize-1;
		}
		
		public int push(int x) {
			if(ptrB < maxSize - (maxSize/2))
				throw new OverflowIntStackException();
			return stk[ptrB--] = x;
		}
		
		public int pop() {
			if(ptrB >= maxSize - 1)
				throw new EmptyIntStackException();
			return stk[++ptrB];
		}
	}
	
	//���� �� ���� : ������ ��� ����
	public static class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	//���� �� ����: ������ ���� ��
	public static class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ũ�⸦ ������ �ּ���");
		int stackSize = sc.nextInt();
		
		maxSize = stackSize;
		stk = new int[maxSize];
		
		StackA stackA = new StackA();
        StackB stackB = new StackB();
		
		while (true) {
			System.out.println("������ ������ �ּ��� (1)A����  (2)B����  (0)����");
			int selectStack = sc.nextInt();
			
			if(selectStack == 0) break;
			
			int x;
			
			if(selectStack == 1) {  //A���ÿ���
				
				System.out.println("(1)Ǫ��  (2)��");
				int selectData = sc.nextInt();
				
				switch (selectData) {
				case 1: 
					System.out.println("������:");
					x=sc.nextInt();
					try {
						stackA.push(x);
					} catch (q3.OverflowIntStackException e) {
						System.out.println("������ ���� ��");
					}
					break;
					
				case 2:
					try {
					x = stackA.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�");
					} catch (EmptyIntStackException e) {
						System.out.println("�迭�� ������ϴ�");
					}
					break;
				}
			} else if(selectStack == 2) {
				System.out.println("(1)Ǫ��  (2)��");
				int selectData = sc.nextInt();
				
				switch (selectData) {
				case 1: 
					System.out.println("������:");
					x=sc.nextInt();
					try {
						stackB.push(x);
					} catch (q3.OverflowIntStackException e) {
						System.out.println("������ ���� ��");
					}
					break;
					
				case 2:
					try {
					x = stackB.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�");
					} catch (EmptyIntStackException e) {
						System.out.println("�迭�� ������ϴ�");
					}
					break;
				}
			}
				
			
			
			
			
		}

	}

}

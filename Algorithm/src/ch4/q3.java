package ch4;
import java.util.Scanner;
//하나의 배열을 공유하여 2개의 스택을 구현하는 int형 데이터용 스택

public class q3 {
	
	private static int[] stk;   //스택 본체
	private static int maxSize; //스택 전체 용량
	
	static class StackA {
		private int ptrA;     //A스택 포인터
		
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
		private int ptrB;     //B스택 포인터
		
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
	
	//실행 시 예외 : 스택이 비어 있음
	public static class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	//실행 시 예외: 스택이 가득 참
	public static class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("스택의 크기를 선택해 주세요");
		int stackSize = sc.nextInt();
		
		maxSize = stackSize;
		stk = new int[maxSize];
		
		StackA stackA = new StackA();
        StackB stackB = new StackB();
		
		while (true) {
			System.out.println("스택을 선택해 주세요 (1)A스택  (2)B스택  (0)종료");
			int selectStack = sc.nextInt();
			
			if(selectStack == 0) break;
			
			int x;
			
			if(selectStack == 1) {  //A스택에서
				
				System.out.println("(1)푸쉬  (2)팝");
				int selectData = sc.nextInt();
				
				switch (selectData) {
				case 1: 
					System.out.println("데이터:");
					x=sc.nextInt();
					try {
						stackA.push(x);
					} catch (q3.OverflowIntStackException e) {
						System.out.println("스택이 가득 참");
					}
					break;
					
				case 2:
					try {
					x = stackA.pop();
					System.out.println("팝한 데이터는 " + x + "입니다");
					} catch (EmptyIntStackException e) {
						System.out.println("배열이 비었습니다");
					}
					break;
				}
			} else if(selectStack == 2) {
				System.out.println("(1)푸쉬  (2)팝");
				int selectData = sc.nextInt();
				
				switch (selectData) {
				case 1: 
					System.out.println("데이터:");
					x=sc.nextInt();
					try {
						stackB.push(x);
					} catch (q3.OverflowIntStackException e) {
						System.out.println("스택이 가득 참");
					}
					break;
					
				case 2:
					try {
					x = stackB.pop();
					System.out.println("팝한 데이터는 " + x + "입니다");
					} catch (EmptyIntStackException e) {
						System.out.println("배열이 비었습니다");
					}
					break;
				}
			}
				
			
			
			
			
		}

	}

}

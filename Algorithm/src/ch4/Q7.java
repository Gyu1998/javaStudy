package ch4;

import ch4.IntQueue.EmptyIntQueueException;

public class Q7 {
	private int max;           //큐의 용량
	private int num;           //현재 데이터 수
	private int[] que;         //큐 본체
	
	private int frontA;        //a방향 첫 번째 요소 커서
	private int rearA;         //a방향 마지막 요소 커서
	
	private int frontB;        //b방향 첫 번째 요소 커서
	private int rearB;         //b방향 마지막 요소 커서
	
	//실행 시 예외 : 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//실행 시 예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	//생성자
	public Q7(int capacity) {
		max = capacity;
		num = frontA = rearA = 0;        //a방향 큐
		frontB = rearB = max -1;         //b방향 큐
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {   //생성할 수 없음
			max = 0;
		}	
	}
	
	//a방향 인큐
	public int endequeA(int x) {
		if(num >= max)
			throw new OverflowIntQueueException();
		que[rearA++] = x;
		num++;
		if(rearA >= rearB)
			rearA = 0;
		return x;
			
	}
	
	//a방향 디큐
	public int dequeA() {
		if(num <= 0)
			throw new EmptyIntQueueException();       //큐가 비어 있음
		int x = que[frontA++];
		num--;
		if(frontA >=rearB)
			frontA = 0;
		return x;
	}
	
	//b방향 인큐
	public int endequeB(int x) {
		if(num >= max)
			throw new OverflowIntQueueException();
		que[rearB--] = x;
		num++;
		if(rearB <= rearA)
			rearB = max-1;
		return x;
			
	}
	
	//b방향 디큐
	public int dequeB() {
		if(num <= 0)
			throw new EmptyIntQueueException();       //큐가 비어 있음
		int x = que[frontB--];
		num--;
		if(frontB <= rearA)
			frontA = 0;
		return x;
	}
	
	
	
	

}

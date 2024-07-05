package ch5;
import java.util.Scanner;
//하노이의 탑  배재귀적으로 하는거 다시 봐야됨 이해 못함!!

import java.util.Stack;

public class Hanoi {
	
	//no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
	static void move(int no, int x, int y) {
		String[] a = {"", "A", "B", "C"};
		
		if(no > 1)
			move(no-1, x, 6-x-y);
		
		System.out.println("원반[" + no + "]을" + a[x] + "기둥에서 " + a[y] + "기둥으로 옮김");
		
		if(no>1)
			move(no-1, 6-x-y, y);
	}
	
	//비 재귀적으로
	static void move1(int no, int x, int y) {
		int[] xstk = new int[100];
		int[] ystk = new int[100];
		int[] sstk = new int[100];      //스택
		int ptr = 0;                    //스택 포인터
		int sw = 0;
		
		while(true) {
			if (sw == 0 && no>1) {
				xstk[ptr] = x;
				ystk[ptr] = y;
				sstk[ptr] = sw;
				ptr++;
				no = no-1;
				y = 6 - x - y;
				continue;
			}
			System.out.printf("원반[%d]을 %d 기둥에서 %d 기둥으로 이동\n", no, x, y);

			if (sw == 1 && no > 1) {
				xstk[ptr] = x;						// x의 값을 푸시
				ystk[ptr] = y;						// y의 값을 푸시
				sstk[ptr] = sw;						// sw의 값을 푸시
				ptr++;
				no = no - 1;
				x = 6  - x - y;
				if (++sw == 2) sw = 0;
				continue;
			}
			do {
				if (ptr-- == 0) 					// 스택이 비어 있으면
					return;
				x  = xstk[ptr]; 					// 값을 저장하고 있는 x를 팝
				y  = ystk[ptr]; 					// 값을 저장하고 있는 y을 팝
				sw = sstk[ptr] + 1;				// 값을 저장하고 있는 sw을 팝
				no++;
			} while (sw == 2);
		}
	}
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반 개수:");
		int n = sc.nextInt();
		
		move1(n, 1, 3);

	}

}

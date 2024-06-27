package ch4;
import java.util.Scanner;

public class Q7Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q7 q = new Q7(5);
		
		while (true) {
			
			System.out.print("(1)a인큐  (2)a디큐  (3)b인큐  (4)b디큐   (0)종료");
			
			int menu = sc.nextInt();
			if (menu == 0) break;
			
			int x;
			switch(menu) {
			case 1:             //a인큐
				System.out.print("데이터:");
				x = sc.nextInt();
				try {
					q.endequeA(x);
				} catch (Q7.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼음");
				}
				break;
				
			case 2:             //a디큐
				try {
					x = q.dequeA();
					System.out.println("a에서 디큐한 데이터는 " + x + "입니다");
				} catch (Q7.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있음");
				}
				break;
				
			case 3:             //b인큐
				System.out.print("데이터:");
				x = sc.nextInt();
				try {
					q.endequeB(x);
				} catch (Q7.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼음");
				}
				break;
				
			case 4:             //b디큐
				try {
					x = q.dequeB();
					System.out.println("b에서 디큐한 데이터는 " + x + "입니다");
				} catch (Q7.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있음");
				}
				break;
			}
		}
		

	}

}

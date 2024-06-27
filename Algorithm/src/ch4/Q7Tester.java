package ch4;
import java.util.Scanner;

public class Q7Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q7 q = new Q7(5);
		
		while (true) {
			
			System.out.print("(1)a��ť  (2)a��ť  (3)b��ť  (4)b��ť   (0)����");
			
			int menu = sc.nextInt();
			if (menu == 0) break;
			
			int x;
			switch(menu) {
			case 1:             //a��ť
				System.out.print("������:");
				x = sc.nextInt();
				try {
					q.endequeA(x);
				} catch (Q7.OverflowIntQueueException e) {
					System.out.println("ť�� ���� á��");
				}
				break;
				
			case 2:             //a��ť
				try {
					x = q.dequeA();
					System.out.println("a���� ��ť�� �����ʹ� " + x + "�Դϴ�");
				} catch (Q7.EmptyIntQueueException e) {
					System.out.println("ť�� ��� ����");
				}
				break;
				
			case 3:             //b��ť
				System.out.print("������:");
				x = sc.nextInt();
				try {
					q.endequeB(x);
				} catch (Q7.OverflowIntQueueException e) {
					System.out.println("ť�� ���� á��");
				}
				break;
				
			case 4:             //b��ť
				try {
					x = q.dequeB();
					System.out.println("b���� ��ť�� �����ʹ� " + x + "�Դϴ�");
				} catch (Q7.EmptyIntQueueException e) {
					System.out.println("ť�� ��� ����");
				}
				break;
			}
		}
		

	}

}

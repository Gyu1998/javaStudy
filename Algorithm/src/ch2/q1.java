package ch2;
//Ű�� ��� ���� ������ ����

import java.util.Scanner;
import java.util.Random;

public class q1 {
	
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i=1; i<a.length; i++)
			if (a[i] > max)
				max = a[i];
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ��� ���մϴ�");
		int num;
		
		do {
		num = rand.nextInt(10); //��� �� ����
		System.out.println("��� �� :" + num + " ��");
		} while(num<=0);
		
		int[] height = new int[num];
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		for (int i=0; i<num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "]:" + height[i]);
		}
		
		System.out.println("�ִ���" + maxOf(height));

	}

}

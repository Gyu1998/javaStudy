package ch2;
//키와 사람 수를 난수로 생성

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
		
		System.out.println("키의 최댓값을 구합니다");
		int num;
		
		do {
		num = rand.nextInt(10); //사람 수 랜덤
		System.out.println("사람 수 :" + num + " 명");
		} while(num<=0);
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for (int i=0; i<num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "]:" + height[i]);
		}
		
		System.out.println("최댓값은" + maxOf(height));

	}

}

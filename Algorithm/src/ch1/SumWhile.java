package ch1;
import java.util.Scanner;
// 1, 2, ... n의 합을 구합니다

public class SumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 :");
		int n = sc.nextInt();

		int sum = 0;
		int i = 1;
		
		while (i <= n) {    //i가 n 이하면 반복함
			sum += i;       //sum에 i를 더함
			i++;            //i를 1 증가
		}
		System.out.println("1부터 n까지의 합:" + sum);
	}

}

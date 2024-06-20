package ch1;
import java.util.Scanner;
//1, 2, ... n의 합을 구합니다

public class SumFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력해주세요");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		for(; i<=n; i++) {  //사전에 초기화 했기에 초기식은 비워둠
			sum += i;
		}
		System.out.println("1부터 n까지의 합은 :" + sum);

	}

}

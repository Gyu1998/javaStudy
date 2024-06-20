package ch1;
import java.util.Scanner;
//입력한 수를 한 변으로 하는 정사각형 출력

public class q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사각형을 출력합니다");
		int n = sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}

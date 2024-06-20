package ch1;
import java.util.Scanner;
//짖각 이등변 삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성
//오른쪽 위가 직각인 이등변 삼각형
//static void triangleU(int n)


public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("몇 단 삼각형?");
			n = sc.nextInt();
		} while(n<=0);
		
		for(int i=n; i>0; i--) {
			
			for(int k=0; k<n-i; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
			
		}

	}

}

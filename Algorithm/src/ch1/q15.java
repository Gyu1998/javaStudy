package ch1;
import java.util.Scanner;
//¢�� �̵ �ﰢ���� ����ϴ� �κ��� �Ʒ��� ���� ������ �޼���� �ۼ�
//������ ���� ������ �̵ �ﰢ��
//static void triangleU(int n)


public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("�� �� �ﰢ��?");
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

package ch2;
import java.util.Scanner;

public class q9 {
	
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31}, //���
			{31,29,31,30,31,30,31,31,30,31,30,31}  //����
	};
	
	//���� year���� �����ΰ�? (����:1/ ���:0)
	static int isLeap(int year) {
		return (year %4 == 0 && year
					%100 !=0 || year %400 ==0)?1:0;
	}
	
	static int sumDays() { //��� ��� �� ��
		int sum = 0;
		for(int i=0; i<mdays[0].length; i++) {
			sum += mdays[0][i];
		}
		System.out.println("��� ��� �ϼ�" +sum);
		return sum;
	}
	
	static int remainingDaysOf(int y, int m, int d) { //���� ��  ��
		
		int year = isLeap(y); 
		int sum = 0;  //������ ��¥
		int rdo = 0;  //���� ��¥
		
		if(year == 0) { //����̸�
			for(int i=0; i<m-1; i++) {
				sum += mdays[0][i];
			}
			sum += d;
			System.out.println("���� ��¥ �� "+sum);
			return rdo = sumDays() - sum; //���� ��¥
		} else {
			for(int i=0; i<m-1; i++) {
				sum += mdays[0][i];
			}
			System.out.println("���� ��¥ �� "+sum);
			return rdo = sumDays()+1 - sum; //���� ��¥
		}
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int retry;         //�ٽ� ���?
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�");
		
		do {
			System.out.println("��:"); int year = sc.nextInt();
			System.out.println("��:"); int month = sc.nextInt();
			System.out.println("��:"); int day = sc.nextInt();
			sumDays();
			
			System.out.printf("�� ���� ���� %d��°�Դϴ�.\n", remainingDaysOf(year, month, day));
			
			System.out.println("�� �� �� �ұ��? (1.�� / 0.�ƴϿ�)");
			retry = sc.nextInt();
		} while (retry ==1 );

	}

}

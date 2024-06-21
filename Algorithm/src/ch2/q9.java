package ch2;
import java.util.Scanner;

public class q9 {
	
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31}, //평년
			{31,29,31,30,31,30,31,31,30,31,30,31}  //윤년
	};
	
	//서기 year년은 윤년인가? (윤년:1/ 평년:0)
	static int isLeap(int year) {
		return (year %4 == 0 && year
					%100 !=0 || year %400 ==0)?1:0;
	}
	
	static int sumDays() { //평년 모든 일 수
		int sum = 0;
		for(int i=0; i<mdays[0].length; i++) {
			sum += mdays[0][i];
		}
		System.out.println("평년 모든 일수" +sum);
		return sum;
	}
	
	static int remainingDaysOf(int y, int m, int d) { //남은 일  수
		
		int year = isLeap(y); 
		int sum = 0;  //지내온 날짜
		int rdo = 0;  //남은 날짜
		
		if(year == 0) { //평년이면
			for(int i=0; i<m-1; i++) {
				sum += mdays[0][i];
			}
			sum += d;
			System.out.println("지낸 날짜 수 "+sum);
			return rdo = sumDays() - sum; //남은 날짜
		} else {
			for(int i=0; i<m-1; i++) {
				sum += mdays[0][i];
			}
			System.out.println("지낸 날짜 수 "+sum);
			return rdo = sumDays()+1 - sum; //남은 날짜
		}
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int retry;         //다시 계산?
		
		System.out.println("그 해 경과 일수를 구합니다");
		
		do {
			System.out.println("년:"); int year = sc.nextInt();
			System.out.println("월:"); int month = sc.nextInt();
			System.out.println("일:"); int day = sc.nextInt();
			sumDays();
			
			System.out.printf("그 남은 일은 %d일째입니다.\n", remainingDaysOf(year, month, day));
			
			System.out.println("한 번 더 할까요? (1.예 / 0.아니요)");
			retry = sc.nextInt();
		} while (retry ==1 );

	}

}

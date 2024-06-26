package ch3;
import java.util.Scanner;

public class q4 {
	
	static int search(int[] a, int n, int ky) {
		int pl = 0;
		int pr = n-1;
		int pc = (pl+pr)/2;
		
		
		System.out.print("   |");
		for(int i=0; i<n; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		System.out.print("---+");
		for(int i=0; i<3*n; i++) 
			System.out.print("-");
		System.out.println();
				
		for(int i=0; i<n; i++) {
			System.out.print("   |");
			
			System.out.println();
			
			System.out.printf("%3d", pc);
			System.out.printf("%3d", i);
		}
		
		do {
			pc = (pl+pr)/2;
			if(a[pc] == ky)
				return pc;
			else if (a[pc] < ky)
				pl = pc +1;
			else 
				pr = pc -1;
		} while(pl <= pr);
		
		
		return -1;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];				// 요솟수가 num 인 배열 

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0] : ");		// 맨앞 요소를 입력받음
		x[0] = sc.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);	// 바로 앞의 요소보다 작으면 다시 입력 받음
		}
		
		System.out.print("검색 값 : ");			// 키값을 입력받음
		int ky = sc.nextInt();
		
		int idx = search(x, num, ky);	// 배열 x에서 값이 ky인 요소를 검색

		if (idx == -1)
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");

	}

}

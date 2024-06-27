package ch5;
//각 열에 1개의 퀸을 배치하는 조합을 재귀적 나열

public class QueenB {
	
	static int[] pos = new int[3];       //각 열의 퀸의 위치
	
	//각 열의 퀸의 위치를 출력
	static void print() {
		for (int i=0; i<3; i++) 
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	//i열에 퀸을 놓습니다
	static void set(int i) {
		for (int j=0; j<3; j++) {
			pos[i] = j;         //퀸을 j행에 배치
			if(i==2)
				print();
			else
				set(i+1);       //다음 열에 퀸을 배치
		}
	}
	
	public static void main(String[] args) {
		set(0);                 //0열에 퀸 배치
	}

}

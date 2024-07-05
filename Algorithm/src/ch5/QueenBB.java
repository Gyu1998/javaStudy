package ch5;
//각 행, 열에 1개의 퀸을 배치하는 조합을 재귀적으로 나열

public class QueenBB {
	
	static boolean[] flag = new boolean[8];   //각 행에 퀸을 배치했느지 체크
	static int[] pos = new int[8];            //각 열의 퀸의 위치
	
	//각 열의 퀸의 위치 출력
	static void print() {
		for (int i=0; i<3; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	static void set(int i) {
		for(int j=0; j<3; j++) {
			if (flag[j] == false) {   //j행에는 퀸을 아직 배치 안했으면
				pos[i] = j;           //퀸을 j행에 배치
				if(i==2)              //모든 열에 배치한 경우
					print();
				else {
					flag[j] = true;
					set(i+1);
					flag[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		set(0);

	}

}

package ch8;
import java.util.Scanner;
//뒤쪽 인덱스 반환
public class Q2 {
	
	static int bfMatchLast(String txt, String pat) {
		int pt = txt.length()-1;
		int pp = pat.length()-1;
		
		while(pt >= 0 && pp >= 0) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt--;
				pp--;
			} else {
				pt = pt + (pat.length() - pp) - 2;
				pp = pat.length()-1;
			}
		}
		if(pp < 0)
			return pt+1;
		else
			return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("텍스트:");
		String s1 = sc.next();        //텍스트용 문자열
		
		System.out.print("패턴:");
		String s2 = sc.next();        //패턴용 문자열
		
		int idx = bfMatchLast(s1, s2);    //문자열 s1에서 문자열 s2를 검색
		
		if(idx == -1)
			System.out.println("텍스트에 패턴이 없음");
		else {
			//일치하는 문자 바로 앞까지의 길이를 구함
			int len = 0;
			for (int i=0; i<idx; i++)
				len += s1.substring(i, i+1).getBytes().length;
			len += s2.length();
			
			System.out.println((idx+1) + "번째 문자부터 일치함");
			System.out.println("텍스트:" + s1);
			System.out.printf(String.format("패턴 :%%%ds\n", len), s2);
		}

	}

}

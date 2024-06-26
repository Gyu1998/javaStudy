package ch2;
import java.util.Scanner;

public class PhysicalExamination {
	
	static final int VMAX = 21; //시력 분포(0.0부터 0.1++ 21개)
	
	static class PhyscData {
		String name;   //이름
		int height;    //키
		double vision; //시력
		
		//생성자
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	//키의 평균값을 구함
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		
		for (int i=0; i< dat.length; i++)
			sum += dat[i].height;
		
		return sum / dat.length;
	}
	
	//시력 분포
	static void distVision(PhyscData[] dat, int[] dist) {
		int i=0;
		
		dist[i] = 0;
		for (i=0; i<dat.length; i++)
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int)(dat[i].vision * 10)]++;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("가나다", 150, 1.3),
				new PhyscData("라마바", 180, 0.5),
				new PhyscData("사바사", 175, 0.8),
				new PhyscData("오렌지", 189, 1.7),
				new PhyscData("김철수", 161, 1.0),
				new PhyscData("이영희", 165, 1.5),
				new PhyscData("홍길동", 178, 0.1),
		};
		int[] vdist = new int[VMAX];   //시력 분포
		
		System.out.println("신체 검사 리스트");
		System.out.println("이름       키   시력");
		System.out.println("------------------");
		
		for(int i=0; i<x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n",
					             x[i].name, x[i].height, x[i].vision);
		
		System.out.printf("\n평균 키:%5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist); //시력 분포
		
		System.out.println("\n시력 분포");
		for (int i=0; i<VMAX; i++)
			System.out.printf("%3.1f :%2d명\n", i/10.0, vdist[i]);

	}

}

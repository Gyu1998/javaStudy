package ch5;

public class Q4 {
	
	static void recur2(int n) {
		if (n>0) {
			recur2(n-2);
			System.out.println(n);
			recur2(n-1);
		}
	}
	
	/*
	하향식 분석  n=4
			
               r(2)            4          r(3)     
            r(0) 2 r(1)           r(1)      3     r(2)         
               r(-1) 1 r(0)   r(-1) 1 r(0)     r(0) 2 r(1)
                                                  r(-1) 1 r(0)
    
    답 : 2 1 4 1 3 1 2
    
    상향식 분석 n=4
    r(1) = r(-1) 1 r(0) = 1
    r(2) = r(0)  2 r(1) = 2 1
    r(3) = r(1)  3 r(2) = 1 3 2 1
    r(4) = r(2)  4 r(3) = 2 1 4 1 3 2 1
    */
    
}

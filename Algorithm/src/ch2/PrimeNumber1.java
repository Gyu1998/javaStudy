package ch2;
//1000 ÀÌÇÏ ¼Ò¼ö ¿­°Å

public class PrimeNumber1 {

	public static void main(String[] args) {
		int counter = 0;         //³ª´°¼À È½¼ö
		
		for(int n=2; n<=1000; n++) {
			int i;
			for(i=2; i<n; i++) {
				counter++;
				if (n%i == 0)    //³ª´©¾î ¶³¾îÁö¸é ¼Ò¼ö°¡ ¾Æ´Ô
					break;       //Å»Ãâ
			}
			if (n == i)          //¸¶Áö¸·±îÁö ³ª´©¾î ¶³¾îÁöÁö ¾ÊÀ½
				System.out.println(n);
		}
		
		System.out.println("³ª´°¼ÀÀ» ¼öÇàÇÑ È½¼ö:" + counter);

	}

}

package ch1;

public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("  |");
		for(int i=1; i<=9; i++) {
			
			System.out.printf("%3d", i);
			
		}
		System.out.println();
		System.out.println("--+-----------------------------");
		for (int i=1; i<=9; i++) {
			
			System.out.printf("%2d|", i);
			
				for(int k=1; k<=9; k++) {
					System.out.printf("%3d", i*k);
				}
			
			System.out.println();
		}	
	}
}

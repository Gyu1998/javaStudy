package ch3;
import java.util.Scanner;

public class q3 {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		
		a[n] = key;
		int j=0;
		
		
		for(int i=0; i<n; i++) {
			if(a[i] == key) {
				idx[j++] = a[i];
				
			}
		}
		
		return j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ڰ�");
		int num = sc.nextInt();
		
		int[] x = new int[num+1];         //��ڼ� n�� �迭
		System.out.print("x[0]:");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
			} while(x[i] < x[i-1]);
		} 
		
		System.out.println("ã�� ��");
		int key = sc.nextInt();
		
		int[] idx = new int[num];
		
		
		int idxCnt = searchIdx(x, num, key, idx);
		
		System.out.println(key + "�� ��ġ�ϴ� ��� ����: " + idxCnt);
		
	}

}

package ch1;
//3���� ������ ��� �ִ��� ���Ͽ� ����մϴ�.

class Max3m {

	//a, b, c�� �ִ��� ���Ͽ� ��ȯ�մϴ�.
	static int max3(int a, int b, int c) {
		int max = a;	//�ִ�
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		
		return max;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("3,2,1 = " + max3(3, 2, 1));
		System.out.println("3,5,1 = " + max3(5, 3, 1));
	
		System.out.println("10,100,1000 = " + max3(10, 100, 1000));
		
		
		
	}
	

}

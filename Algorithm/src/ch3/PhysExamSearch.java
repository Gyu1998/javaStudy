package ch3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
//��ü�˻� ������ �迭���� ���� �˻��ϱ�
//q7 ��������

public class PhysExamSearch {
	
	//��ü�˻� ������ ����
	static class PhyscData {
		private String name;   //�̸�
		private int    height; //Ű
		private double vision; //�÷�
		
		//������
		public PhyscData(String name, int height, double vision) {
			this.name = name; this.height = height; this.vision = vision;
		}
		
		//���ڿ��� ��ȯ�ϴ� �޼���(���� Ȯ�ο�)
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		
		//������������ �����ϱ� ���� comparator
		/*
		public static final Comparator<PhyscData> HEIGHT_ORDER 
		= new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
			}
		}
		*/
		
		//�������� ���� comparator
		public static final Comparator<PhyscData> HEIGHT_DEORDER
		= new HeightDeorderComparator();
		
		private static class HeightDeorderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height < d2.height) ? 1 : (d1.height > d2.height) ? -1 : 0;
			}
		}
	}
	
	

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		PhyscData[] x = { //Ű�� ������������ ����
		    new PhyscData("�̳���", 160, 0.3),
		    new PhyscData("�̳���", 163, 0.4),
		    new PhyscData("�̳���", 166, 0.5),
		    new PhyscData("�̳���", 150, 0.6),
		    new PhyscData("�̳���", 155, 0.7),
		    new PhyscData("�̳���", 170, 0.8),
		    new PhyscData("�̳�ĥ", 180, 0.9),
		    new PhyscData("�̳���", 145, 1.0),	
		};
		
		// �迭�� Ű(height) �������� �������� ����
        Arrays.sort(x, PhyscData.HEIGHT_DEORDER);
        
		System.out.print("�� cm�� ����� ã�� �ֳ���?:");
		int height = sc.nextInt();
		int idx = Arrays.binarySearch(
				x,                               //�迭 x����
				new PhyscData("", height, 0.0),  //Ű�� height�� ��Ҹ�
				//PhyscData.HEIGHT_ORDER           //HEIGHT_ORDER�� ���� �˻�
				PhyscData.HEIGHT_DEORDER           //HEIGHT_ORDER�� ���� �˻�
				);
		
		if (idx < 0)
			System.out.println("��Ұ� ����");
		else {
			System.out.println("x[" + idx + "]�� ����");
			System.out.println("ã�� ������: " + x[idx]);
		}

	}

}

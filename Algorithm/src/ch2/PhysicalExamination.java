package ch2;
import java.util.Scanner;

public class PhysicalExamination {
	
	static final int VMAX = 21; //�÷� ����(0.0���� 0.1++ 21��)
	
	static class PhyscData {
		String name;   //�̸�
		int height;    //Ű
		double vision; //�÷�
		
		//������
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	//Ű�� ��հ��� ����
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		
		for (int i=0; i< dat.length; i++)
			sum += dat[i].height;
		
		return sum / dat.length;
	}
	
	//�÷� ����
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
				new PhyscData("������", 162, 0.3),
				new PhyscData("������", 150, 1.3),
				new PhyscData("�󸶹�", 180, 0.5),
				new PhyscData("��ٻ�", 175, 0.8),
				new PhyscData("������", 189, 1.7),
				new PhyscData("��ö��", 161, 1.0),
				new PhyscData("�̿���", 165, 1.5),
				new PhyscData("ȫ�浿", 178, 0.1),
		};
		int[] vdist = new int[VMAX];   //�÷� ����
		
		System.out.println("��ü �˻� ����Ʈ");
		System.out.println("�̸�       Ű   �÷�");
		System.out.println("------------------");
		
		for(int i=0; i<x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n",
					             x[i].name, x[i].height, x[i].vision);
		
		System.out.printf("\n��� Ű:%5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist); //�÷� ����
		
		System.out.println("\n�÷� ����");
		for (int i=0; i<VMAX; i++)
			System.out.printf("%3.1f :%2d��\n", i/10.0, vdist[i]);

	}

}

package ch8;
import java.util.Scanner;

//���̾�-��������� ���ڿ� �˻�

public class BMmatch {
	
	//--- ���̾�-��������� ���ڿ� �˻� ---//
    static int bmMatch(String txt, String pat) {
        int pt;                           // txt�� ���󰡴� Ŀ��
        int pp;                           // pat�� ���󰡴� Ŀ��
        int txtLen = txt.length();        // txt�� ���� ����
        int patLen = pat.length();        // pat�� ���� ����
        int[] skip = new int[Character.MAX_VALUE + 1];    // �ǳʶٱ� ǥ(skip ���̺�)

        // skip ���̺� �ۼ�
        for (pt = 0; pt <= Character.MAX_VALUE; pt++)
            skip[pt] = patLen;
        for (pt = 0; pt < patLen - 1; pt++)
            skip[pat.charAt(pt)] = patLen - pt - 1;  // pt == patLen - 1
        // �˻�
        while (pt < txtLen) {
            pp = patLen - 1;                         // pat�� ������ ���ڿ� �ָ�

            while (txt.charAt(pt) == pat.charAt(pp)) {
                if (pp == 0)
                    return pt;                  // �˻� ����
                pp--;
                pt--;
            }
            pt += (skip[txt.charAt(pt)] > patLen - pp) ? skip[txt.charAt(pt)] : patLen - pp;
        }
        return -1;                             // �˻� ����
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("�ؽ�Ʈ: ");
        String s1 = sc.next();                     // �ؽ�Ʈ�� ���ڿ�

        System.out.print("��  ��: ");
        String s2 = sc.next();                     // ���Ͽ� ���ڿ�

        int idx = bmMatch(s1, s2);                    // ���ڿ� s1���� ���ڿ� s2�� BM������ �˻�

        if (idx == -1)
            System.out.println("�ؽ�Ʈ �ȿ� ������ �����ϴ�.");
        else {
            // ��ġ�ϴ� ���� �ٷ� �ձ��� �ݰ�(1����Ʈ) ������ ������ ���մϴ�
            int len = 0;
            for (int i = 0; i < idx; i++)
                len += s1.substring(i, i + 1).getBytes().length;
            len += s2.length();

            System.out.println((idx + 1) + "��° ���ں��� ��ġ�մϴ�.");
            System.out.println("�ؽ�Ʈ: " + s1);
            System.out.printf(String.format("��  ��: %%%ds\n", len), s2);
        }

	}

}

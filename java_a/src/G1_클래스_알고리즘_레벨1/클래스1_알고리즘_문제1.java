package G1_Ŭ����_�˰���_����1;

import java.util.Arrays;

class Test04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class Ŭ����1_�˰���_����1 {
	public static void main(String[] args) {
		
		Test04 test04 = new Test04();
		
		
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47

		System.out.println(Arrays.toString(test04.hakbuns));		
		for(int i= 0; i <test04.hakbuns.length; i++) {
			System.out.println("i : " + i);
			test04.scores[i] = test04.hakbuns[i];
		}
		System.out.println("1��. scores�� �й� �ֱ�");
		System.out.println(Arrays.toString(test04.scores));
		
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		
		int total = 0;
		float average = 0;
		
		for(int i= 0; i <test04.scores.length; i++) {
			System.out.println("�÷��� �� : "+ test04.scores[i]);
			total += test04.scores[i];
		}
		average = total / test04.scores.length;
		System.out.println("�������� ����");
		System.out.println("Total : "+  total);
		System.out.println("Average : " + average);
		
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��

		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��

		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1

		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 92��

		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.

		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1003��(92��)
	}
}

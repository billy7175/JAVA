package D7_�ݺ���_�˰���_LV3;
import java.util.Random;
public class D7_�����������_���� {
	/*
	 * [�����������]
	 * 
	 * 1. 10ȸ �ݺ��� �Ѵ�.
	 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
	 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
	 * ---------------------------------------
	 * . [1] ������(10��)�� ������ ����� ����Ѵ�.
	 * . [2] �հ��� ���� ����Ѵ�.
	 * . [3] 1�� �л��� ��ȣ�� ������ ����Ѵ�.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int total = 0;
		int count = 0;
		int number = 0;
		int maxScore = 0;
		for(int i = 1; i <= 10; i++) {
			
			// [1] ��������� 
			int r = ran.nextInt(100) + 1; 
			
			// [2] �հݿ��� ����
			if(r >= 60) {
				System.out.println(i + "�� �л� �հ� : " + r);
				count += 1;
			} else {
				System.out.println(i + "�� �л� ���հ� : " +r);
			}
			
			// [3] 1�������� 1���ȣ�� ����.
			if(maxScore < r) {
				maxScore = r;
				number = i;
			}
			
			// [4] ��ü�� ���� 
			total = total + r;
		}
		System.out.println("���� : " + total + " ��� : " + total/10.0);
		System.out.println("�հݻ��� : " + count);
		System.out.println("1�� : " + number + " ���� : " + maxScore);
	}

}

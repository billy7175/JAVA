package E1_�迭1_�⺻�̷�;
import java.util.Random;
public class �迭1_�⺻�̷�4_�л�����1_���� {
	/*
		 [����1] array �迭�� 1~100�� ������ ���� ������ 5�� �����ϰ� ���
		 ��)    87, 11, 92, 14, 47
		
		 [����2] �������� ������ ��� ���
		 ��)    ����(251) ���(50.2)
		
		 [����3] ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		 ��)   2��
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[5];
		Random random = new Random();
		int total = 0;
		int count = 0;
		double average;
		for(int i=0; i <array.length; i++) {
			array[i] = random.nextInt(100)+1;
			System.out.println("�� ���� ���ڴ� :" + array[i]);
			total += array[i];
			if(array[i] >= 60) {
				count += 1;
			}
		
		}
		average = total / 5;
		System.out.println("�л����� ���� : "+ total);
		System.out.println("�л����� ��� : " + average);
		System.out.println("�հ��� �л��� �� : " + count );
		
	}

}

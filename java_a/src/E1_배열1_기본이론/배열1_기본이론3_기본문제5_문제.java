package E1_�迭1_�⺻�̷�;
import java.util.Random;

public class �迭1_�⺻�̷�3_�⺻����5_���� {

	/*
	 * [����]
	 *  array �迭�� 0~100������ ������ 5�� ������ ��簪�� ����Ѵ�.
	 */
	public static void main(String[] args) {
		int array1[] = new int[5];
		
		Random random = new Random();
		for(int i = 0; i < array1.length; i++) {
			int randomNumber = random.nextInt(101);
			array1[i] = randomNumber;
			System.out.println("�� ���� ���ڴ� : " + randomNumber);
			
		}
	}

}

package C5_���ǹ�_�⺻�̷�3;
import java.util.Random;
public class ����ū��ã�� {

	public static void main(String[] args) {
		// [1] ���� ū �� ã��
		// a, b, c �� �������� 1 ~ 100�� ���� �� ���� ū ���� ����ϼ���.
		Random random = new Random();
		int a = random.nextInt(100) + 1;
		int b = random.nextInt(100) + 1;
		int c = random.nextInt(100) + 1;
		int answer = 0; // ���� ū ��;
		System.out.printf("a : %d,  b: %d, c: %d ", a, b ,c );
		if(a > b) {
			answer = a;
		}
		if(a > c) {
			answer = c;
		}
		
		if(b > a ) {
			answer = b;
		}
		if(b > c ) {
			answer = b;
		}
		
		if(c > a ) {
			answer = c;
		}
		if(c > b) {
			answer = c;
		}
		System.out.println("���� ū ���� " + answer + "�Դϴ�.");
		
	}

}

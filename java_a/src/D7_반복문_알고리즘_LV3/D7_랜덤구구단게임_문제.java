package D7_�ݺ���_�˰���_LV3;
import java.util.Scanner;
import java.util.Random;


public class D7_���������ܰ���_���� {
	/*
	 *  [���������� ����] (�ݺ������)
	 * 1. ���������� ������ 10ȸ �ݺ��Ѵ�.
	 * 2. ������ ���߸� 1������ 10���̴�.
	 * 3. ���� ���� ��, ������ ����Ѵ�.
	 * 4. ��, 3����������Ʋ���� ��������ϸ� 0���̵ȴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int combo = 0;
		
		for(int i=0; i < 10; i++) {
			int a = random.nextInt(8)+2; // 2~9
			int b = random.nextInt(9) + 1; // 1~9
			int answer = a * b;
			System.out.printf("%d * %d = ?", a, b);
			int myAnswer = scan.nextInt();
			if(answer == myAnswer) {
				System.out.println("����");
				count = count +1;
				combo = 0;
			} else {
				combo = combo +1;
				System.out.println("����");
			}
			System.out.println("���ӽ��� : "+ combo);
			if(combo == 3) {
				System.out.println("��������" +combo +"����");
				count = 0;
				break;
			}
					
		}
		System.out.println(count * 10 + "��");

	}

}

package C5_���ǹ�_�⺻�̷�3;
import java.util.Random;
import java.util.Scanner;
public class C5_�⺻�̷�1_���� {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int a = random.nextInt(6);
		a = a +1;
		System.out.println(a);
		
		// 5 ~ 10 ������ �������� ����غ�����.
		int b = random.nextInt(6); // 0 1 2 3 4 5 + 5
		b = b +5;
		System.out.println("b�� ���� = " + b);
		
		int c;
		c = random.nextInt(101) + 50;
		
		// ����������
		// [1] ���� 2�� 1~9�� FOSEJADMFH �����ϰ�, ����Ѵ�.
		// ==> 3 x 5
		// [2] ������ �Է��ϰ� �� ����� �� ������ ��ġ�ϸ� "����", Ʋ���� "����"
		int firstNum = random.nextInt(9)+1;
		int secondNum = random.nextInt(9)+1;
		int answer = firstNum * secondNum;
		int yourAnswer;
		System.out.println("--------------------------------");
		System.out.println("������ Ǯ���ּ���.");
		System.out.println("����� ���� :  "+ answer);
		System.out.println(firstNum + " X " +  secondNum);
		System.out.println("������ �Է����ּ��� :");
		yourAnswer = scan.nextInt();
		if(answer == yourAnswer) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		
		scan.close();
		
		
	}

}

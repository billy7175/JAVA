package C6_���ǹ�_�˰���_LV3;
import java.util.Scanner;
import java.util.Random;


public class C6_�����ڱ�ȣ_���� {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int a = random.nextInt(10) + 1;
		int b = random.nextInt(10) + 1;
		int op = random.nextInt(4) + 1;
		int add = 1;
		int subtract = 2;
		int multiply = 3;
		int divide = 4;
		int answer = 0;
		int yourAnswer;
		System.out.println(answer);
		if(op == add) {
			answer = a + b;
		}
		if(op == subtract) {
			answer = a - b;
		}
		
		if(op == multiply) {
			answer = a * b;
		}
		
		if(op == divide) {
			answer = a / b;
		}
		
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);		
		System.out.println("op : " + op);
		System.out.println("���� [1]. +, [2] -, [3] *, [4]. / ");
		System.out.printf("%d ? %d = %d", a, b, answer);
		System.out.println("�����ڸ� ����ּ���");
		yourAnswer = scan.nextInt();
		System.out.println("�� ������ " + yourAnswer);
		if(answer == yourAnswer) {
			System.out.println("����");
		} else {
			System.out.println("�� ");
		}
		
		scan.close();
	
	}

}

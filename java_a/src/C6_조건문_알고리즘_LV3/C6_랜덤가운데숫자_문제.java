package C6_���ǹ�_�˰���_LV3;
import java.util.Scanner;
import java.util.Random;
public class C6_�����������_���� {
	/*
	  
  	[��� ���� ���߱� ����]
  
	   [1] 150~250 ������ ���� ���� �����Ѵ�.
	   [2] ���� ������ ��� ���ڸ� ���� �Է��Ͽ� ���ߴ� �����̴�.
	   (��)
  			249		: 4
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int number= random.nextInt(101); // 0 ~ 100;
		number += number = 150;
		System.out.println(number);
		int a = number % 100; // ���� �ڸ� �����
		int b = a / 10; // ���� �ڸ�����
		System.out.println("number = "+ number);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("��� ���ڸ� �Է����ּ���.");
		int myAnswer = scan.nextInt();
		if(b == myAnswer) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}
		
		scan.close();
	}

}

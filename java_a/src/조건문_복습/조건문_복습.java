package ���ǹ�_����;
import java.util.Scanner;

public class ���ǹ�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computer = 8;
		int myNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		myNumber = scan.nextInt();
		System.out.println("�Է��� ���� : " + myNumber);
		if(myNumber < computer) {
			System.out.println("Up!");
		} else if (myNumber == computer) {
			System.out.println("Bing Go");
		} else {
			System.out.println("Down");
		}
		
	}

}

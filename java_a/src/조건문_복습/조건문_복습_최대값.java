package ���ǹ�_����;
import java.util.Scanner;
public class ���ǹ�_����_�ִ밪 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int first;
		int second;
		int third;
		int answer = 0;
		System.out.println("���� 3���� �Է����ּ���.");
		System.out.println("ù��° ���ڸ� �Է����ּ���");
		first = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է����ּ���.");
		second = scan.nextInt();
		System.out.println("����° ���ڸ� �Է����ּ���.");
		third = scan.nextInt();
		if(first > second) {
			answer = first;
		}
		if(first > third) {
			answer = first;
		}
		if(second > first) {
			answer = second;
		}
		if(second > third) {
			answer = second;
		}
		if(third > first){
			answer = third;
		}
		if(third > second) {
			answer = third;
		}
		System.out.println("���� ū ���� : " + answer);
	}
}

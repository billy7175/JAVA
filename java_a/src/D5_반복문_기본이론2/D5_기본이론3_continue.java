package D5_�ݺ���_�⺻�̷�2;
import java.util.Scanner;

public class D5_�⺻�̷�3_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int run = 1;
		while (run == 1) {
			System.out.println("1.�ܹ���");
			System.out.println("2.�ݶ�");
			System.out.println("3.����");

			int sel = scan.nextInt();

			if (sel != 1 && sel != 2 && sel != 3) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}			
			if (sel == 1) {
				System.out.println("�ܹ���");
			} else if (sel == 2) {
				System.out.println("�ݶ�");
			} else if (sel == 3) {
				System.out.println("����");
			}
		}
	}

}

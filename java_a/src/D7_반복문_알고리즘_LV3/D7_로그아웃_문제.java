package D7_�ݺ���_�˰���_LV3;
import java.util.Scanner;

public class D7_�α׾ƿ�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int id1 = 1111;
		int pw1 = 1234;

		int id2 = 2222;
		int pw2 = 2345;
		
		int log = -1; // -1(�α׾ƿ�), 1111(id1), 2222(id2)
		
		boolean run = true;
		while(run == true) {
			System.out.println("1. �α���");
			System.out.println("2. �α׾ƿ�");
			System.out.println("0. ����");
			System.out.println("�޴� ���� : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(log == -1) {
					System.out.println("���̵� �Է� : ");
					int userId = scan.nextInt();
					System.out.println("��й�ȣ�� �Է� : ");
					int userPwd = scan.nextInt();
					if(id1 == userId && pw1 == userPwd) {
						log = id1;
						System.out.println(log + "�� �α��� ����");
					} else if (id2 == userId && pw2 == userPwd) {
						log = id2;
						System.out.println(log + "�� �α��� ����");
					} else {
						System.out.println("���� " + log +" �� �̹� �α��� ���Դϴ�.");
					}
				}
			} else if (sel == 2) {
				if(log != -1) {
					log = -1;
				} else {
					System.out.println("�α��� ���¿��� ������ ����Դϴ�.");
				}
			} else { // 0�ϋ�
				run = false;
				System.out.println("���α׷� ����");
			}
		}
	}

}

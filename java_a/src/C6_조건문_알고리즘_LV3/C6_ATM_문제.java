package C6_���ǹ�_�˰���_LV3;
import java.util.Scanner;
public class C6_ATM_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int adminId = 1234;
		int adminPw = 1234;
		int balance = 1000;
		int cash = 100000;
		int loginId;
		int loginPw;
		System.out.println("----- A T M -----");
		System.out.println("���̵� �Է����ּ��� :");
		loginId = scan.nextInt();
		System.out.println("��й�ȣ�� �Է����ּ��� :");
		loginPw = scan.nextInt();
		
		if(adminId == loginId && adminPw == loginPw) {
			System.out.println("�α����� �����߽��ϴ�");
			
			System.out.println("���Ͻô� �ŷ��� ��ȣ�� �������ּ���.");
			System.out.println("[1. �Ա�] [2. ���]");
			
			int select2 = scan.nextInt();
			if(select2 == 1) {
				System.out.println("[�Ա�] �ݾ� �Է� : ");
				int money = scan.nextInt();
				cash -= money;
				balance += money;
				System.out.println("���� ���� : "+ cash);
				System.out.println("���� �ܰ� : " + balance);
			} else if(select2 == 2){
				System.out.println("[���] �ݾ� �Է� : ");
				int money = scan.nextInt();
				cash += money;
				balance -= money;
				System.out.println("���� ���� : "+ cash);
				System.out.println("���� �ܰ� : " + balance);
			}
		} else {
			System.out.println("�α����� �����߽��ϴ�");
		}
		
		scan.close();

	}

}

package C5_���ǹ�_�⺻�̷�3;
import java.util.Scanner;
public class C5_�⺻�̷�4_else������ {

	public static void main(String[] args) {
		System.out.println("���Ǳ� : [1.���� 2.����� 3.���]");
		System.out.println("��ȣ�� ����ּ���.3");
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		if(select == 1) { System.out.println("1.����");}
		if(select == 2) { System.out.println("2.�����");}
		if(select == 3) { System.out.println("3.���");}
		
		if(select != 1 && select != 2 && select != 3 ) {
			System.out.println("����");
		}
		scan.close();
	}

}

package C5_���ǹ�_�⺻�̷�3;
import java.util.Scanner;

public class C5_�⺻�̷�5_if�ɼ�_elseif {
/*
 * 
 * 
 * */
	public static void main(String[] args) {
		System.out.println("���Ǳ� : [1.���� 2.����� 3.���]");
		System.out.println("��ȣ�� ����ּ���.3");
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		if(select == 1) { 
			System.out.println("1.����");
		} else if(select == 2) { 
			System.out.println("2.�����");
		} else if(select == 3) { 
			System.out.println("3.���");
		} else  {
			System.out.println("����");
		}
		scan.close();
	}

}

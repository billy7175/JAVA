package C5_���ǹ�_�⺻�̷�3;
import java.util.Scanner;
public class C5_�⺻�̷�6_elseifȰ�� {
/*
 * ���������� ������ IF - ELSE IF �������� �����غ���
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] ���������
		// P1�� P2�� ����(1) ����(2) ��(3)�� �Է¹ް� ������
		Scanner scan = new Scanner(System.in);
		
		int p1;
		int p2;
		System.out.println("����(1) ����(2) ��(3)");
		System.out.println("p1�� ���� ����ּ���");
		p1 = scan.nextInt();
		System.out.println("p1 ������ �� = "+ p1 );
		System.out.println("p2�� ���� ����ּ���.");
		p2= scan.nextInt();
		System.out.println("p2 ������ ��" + p2 );
		//p1�� �̱�� ���
		
		if(p1 == p2 ) {
			System.out.println("������");
		} else {
			// p1�� �̱�� ���
			if((p1 == 1 && p2 ==3) || ((p1 == 2 && p2 == 1)) || ((p1 == 3 && p2 == 2 ))) {
				System.out.println("p1 �¸� ");
			} else {
				System.out.println("p2 �¸�");
			}
//			if(p1 == 2 && p2 == 1) {
//				System.out.println("p1 �¸� ");
//			}
//			if(p1 == 3 && p2 == 2 ) {
//				System.out.println("p1 �¸� ");
//			}
			
			// P2�� �̱�� ���
//			if(p1 == 2 && p2 ==3) {
//				System.out.println("p2 �¸� ");
//			}
//			if(p1 == 3 && p2 == 1) {
//				System.out.println("p2 �¸� ");
//			}
//			if(p1 == 1 && p2 == 2 ) {
//				System.out.println("p2 �¸� ");
//			}
		}
		
		scan.close();
		//[2] ���� ū �� ã��;
		// a, b, c �� �������� 1 ~ 100�� ���� �� ���� ū ���� ����ϼ���.;
 	}

}

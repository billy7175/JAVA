package D5_�ݺ���_�⺻�̷�2;
import java.util.Scanner;

public class D5_�⺻�̷�7_�ڷΰ��� {
	/*
	 * [�ڷΰ���]
	 *      ���θ����θ޴����� �����Ƿ��� ������
	 *      �ڷΰ��� ������������ �����Ƿ� �������� �����ҷ����Ѵ�.
	 * 		
	 * 1. �����Ƿ�
	 * 		1) Ƽ����
	 * 		2) ����
	 * 		3) �ڷΰ���
	 * 2. �����Ƿ�
	 * 		1) �����
	 * 		2) ġ��
	 * 		3) �ڷΰ���
	 * 3. ����
	 * 
	 * 
	 * [�����Ƿ��� �����Ƿ��� ���������� �ڷΰ��⸦ �����غ�����]
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		boolean run = true;
		while(run) {
			System.out.println("=== �׸� ���θ� ===");
			System.out.println("[1] �����Ƿ� [2] �����Ƿ� [0] ���α׷� ����" );
			int sel = scan.nextInt();	
			if(sel == 1) {
				boolean run2= true;
				while(run2) {
					System.out.println("=== ���� �Ƿ� === ");
					System.out.println("[1] Ƽ���� [2] ġ�� [3] ���� [0] �ڷΰ���");
					int sel2 = scan.nextInt();
					if(sel2 ==1) {
						System.out.println("Ƽ����");
					}
					else if(sel2 ==2) {
						System.out.println("ġ��");
					} else if (sel2 == 3) {
						System.out.println("��ġ");
					} else {
						run2 = false;
					}
				}
				
			}
			else if(sel == 2) {
				boolean run2= true;
				while(run2) {
					System.out.println("=== ���� �Ƿ� ===");
					System.out.println("[1] ���� Ƽ���� [2] ���� ġ�� [3] ���� ���� [0] �ڷΰ���");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						System.out.println("���� Ƽ����");
					}
					if(sel2 == 2) {
						System.out.println("���� ġ��");
					}
					if(sel2 == 3) {
						System.out.println("���� ����");
					} else {
						run2 = false;
					}
				}
	
			}
			else if(sel == 0) {				
				System.out.println("���α׷� ����");
				run = false;
			}
			
		}

	}

}

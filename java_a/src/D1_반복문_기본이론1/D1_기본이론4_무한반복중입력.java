package D1_�ݺ���_�⺻�̷�1;
import java.util.Scanner;

public class D1_�⺻�̷�4_���ѹݺ����Է� {
	/*
	 [�ݺ��� ����]
	  [1] ���� �ݺ��� �ϸ鼭 ���ڸ� �Է¹޴´�.
	  [2] �Է��� ���ڰ� -100�̸�, ���α׷��� ����ȴ�.
	  [��]
		  ���� �Է�[EXIT:-100] : 1
		  ���� �Է�[EXIT:-100] : 3
		  ���� �Է�[EXIT:-100] : 4
		  ���� �Է�[EXIT:-100] : -100
	  [���α׷� ����]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run == true) {  // run == true �� run ���� ���ȴ�.
			System.out.println("�����Է�[EXIT:-100] : ");
			int num = scan.nextInt();
			if(num == -100) {
				System.out.println("���α׷�����");
				run = false;
			}else {
				System.out.println(num);
			}			
		}
		
		scan.close();

	}

}

package E1_�迭1_�⺻�̷�;
import java.util.Scanner;
public class �迭1_�⺻�̷�4_�л�����2_���� {
	/*
	 * 	 array = { 87, 11, 45, 98, 23 };
	  
		 [����1] �ε����� �Է¹޾� ���� ���
		 [����1] �ε��� �Է� : 1 ���� : 11��
	
		 [����2] ������ �Է¹޾� �ε��� ���
		 [����2] ���� �Է� : 11 �ε��� : 1
	 */
	public static void main(String[] args) {
		int array[] = {87, 11, 45, 98, 23};
		int score = 0;
		for(int i=0; i < array.length; i++) {
			System.out.println("�ε����� ���� ���� ��� :"+ array[i]);
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է¹޾� �ε��� ���");
		int userScore = scan.nextInt();
		System.out.println("�Է��� ������ : "+ userScore);
		for(int i=0; i<array.length; i++) {
			if(array[i] == userScore) {
				score = i;
			} 
		}
		
		
		if(score == 0) {
			System.out.println("�Է��Ͻ� ������ ���� ã�� �� �����ϴ�.");
		} else {
			
			System.out.println("�Է��Ͻ� ������ �ε��� ���� : " + score);
		}
		
		scan.close();
	}

}

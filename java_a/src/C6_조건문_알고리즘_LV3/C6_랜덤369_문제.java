package C6_���ǹ�_�˰���_LV3;
import java.util.Random;
public class C6_����369_���� {
	/*
	   [369����]
	  
	   [1] 1~50 ������ ���� ���ڸ� �����Ѵ�.
	   [2-1] ���������߿��� 3�̳� 6�̳� 9�� ������  2����, ¦¦�� ����Ѵ�.
	   [2-2] ���������߿��� 3�̳� 6�̳� 9�� ������  1����, ¦�� ����Ѵ�.
	   [2-3] 0���̸�, �ش� ���ڸ� ����Ѵ�.
	   (��)
	   		33	==> ¦¦
	   		16	==> ¦
	   		 7	==> 7
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int randomNum = random.nextInt(50)+1;
		System.out.println("������ ���� : " + randomNum);
		
	}

}

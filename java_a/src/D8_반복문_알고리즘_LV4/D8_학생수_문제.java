package D8_�ݺ���_�˰���_LV4;

public class D8_�л���_���� {
	/*
	[����] 
	
		6�� 8�� ������� ��� ���
	
		 ������� ���μ��� �����ξ���� ���Ѵ�.
		 ��)    
		 	6 �Ǿ���� 1, 2, 3, 6 �̴�.
		    8 �Ǿ���� 1, 2, 4, 8 �̴�.
		    
		 6�� 8�� �������  1, 2 �̴�.
		 6�� 8�� �ִ������� 2 �̴�.
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 8;
		int i = 1;
		int num = 0;
		while(true) {
			if(i == a ) {
				break;
			}
			if(a % i == 0 && b % i == 0) {
				System.out.println(i);
				num = i;
			}
			if(b % i == 0) {
				System.out.println(i);
			}
			System.out.println("--------");
			i = i +1;
		}
		System.out.println("�ִ� ����� : " + num);
	}

}

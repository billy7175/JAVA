package D8_�ݺ���_�˰���_LV4;

public class D8_�л���������_���� {
	/*
	 * [����]
	  
	    �Ķ����� 50���� ���� ���� 70���� �ִ��� ���� �л��鿡�� �Ȱ��� �������ٷ����Ѵ�.
		�Ķ������� 5�������� ���������� 2���� �����Ҷ�, ���������� ���Ͽ���.
		1) �л����� ���ΰ���?
		2) �л��� �ްԵǴ� ���������� ������ ���Ͽ��� .
		3) �л��� �ްԵǴ� �Ķ������� ������ ���Ͽ��� .
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int blue = 50 - 5;
		int red = 70 + 2;
		int student = 0;
		
		while(true) {
			if(i == blue) {
				break;
			}
			
			if(blue % i == 0 && red % i ==0) {
				System.out.println(i);
			}
			
			i +=1;
		}
		
		System.out.println((blue + 5) / student);
		System.out.println((red -2) / student);
	}

}

package D8_�ݺ���_�˰���_LV4;

public class D8_�ּҰ����1_���� {

	/*
		[����]
		  8 �� 12 �� �ּ� ������� ���Ͻÿ�
			 �ּ� ������� �� ���� ����� �����Ѵ��� ó������ �������ڸ� ���Ѵ�.
			 ��) 8 16 24... 
			 ��) 12 24....
			 ���⼭ 24�� �ּҰ�����̴�.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while(true) {
			if(i % 8 == 0 && i % 12 == 0) {
				System.out.println(i);
				break;
			}
			i += i;
		}
	}

}

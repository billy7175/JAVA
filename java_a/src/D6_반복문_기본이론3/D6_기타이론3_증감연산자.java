package D6_�ݺ���_�⺻�̷�3;

public class D6_��Ÿ�̷�3_���������� {
	/*
	 * 	[����������] 
	 * 	
	 *   [1] ++a    
	 *   	- ���� a�� 1�� �������� ��µȴ�.
	 *   
	 *   [2] a++
	 *   	- ���� a�� ��µǰ��� 1�̴�������. 	
			 ������ �켱������ ���ؼ� 
			 ++�� ���� �ڿ� ���̴°� �켱������ ���峷�Ƽ� b�� ���� ��µǰ��� ���ϱ� 1�̵ȴ�. 
			 �̷����̿��ؼ� �ڵ带 �����������ϼ���������, ���������ʴ´�. 
			 ��Ȯ�� �ڵ��ϴ°� �� ����. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println(++a);
		System.out.println(a);
		System.out.println("---------");
		int b = 10;
		System.out.println(b++);
		System.out.println(b);
		int c= 10;
		c+= 1;
		System.out.println(c);
	}

}

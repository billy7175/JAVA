package D7_�ݺ���_�˰���_LV3;

public class D7_369�ڼ�_���� {
	/*
	 *  [369����]
	 * 1. 1~50���� �ݺ��� �Ѵ�.
	 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
	 * 
	 * 3. ������ ���ڿ� 3�̳� 6�̳� 9�� �ΰ� �� "¦¦"
	 * 4. ������ ���ڿ� 3�̳� 6�̳� 9�� �Ѱ� �� "¦"
	 * 5. 3�̳� 6�̳� 9�� ������ �׳� ������� 
	 * 
	 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while(i <= 50) {
			int a = i / 10; // ���� �ڸ� 
			int b = i % 10; // ���� �ڸ� ��
			System.out.println("a : "+ a);
			System.out.println("b : "+ b);
			int count = 0;
			if(a == 3 || a == 6 || a == 9) {
				count += 1;
			}
			if(b == 3 || b == 6 || b == 9) {
				count += 1;
			}
			if(count == 0) {
				System.out.println(i);
			}
			
			if(count == 1) {
				System.out.println("¦");
			}
			
			if(count == 2) {
				System.out.println("¦¦");
			}
//			System.out.println(i);
			i += 1;
			
		}
	}

}

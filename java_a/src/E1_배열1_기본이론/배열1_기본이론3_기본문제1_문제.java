package E1_�迭1_�⺻�̷�;

public class �迭1_�⺻�̷�3_�⺻����1_���� {
	/*
	 [����1] 10���� 50���� array �迭�� ������ �迭���� ��簪�� ����Ѵ�.
	 [��] 10 20 30 40 50

	 [����2] array �迭���� ��簪�� ���� ����Ѵ�.
	 [��] 150
*/
	public static void main(String[] args) {
		int array [] = {10,20,30,40,50};
		
		for(int i = 0; i < 5; i++) {
			System.out.println(array[i]);
		}
		
		int total = 0;
		for(int i = 0; i < 5; i++) {
			total += array[i];
		}
		
		System.out.println("�� : " + total);
	}

}

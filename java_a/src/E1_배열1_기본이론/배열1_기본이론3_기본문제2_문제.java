package E1_�迭1_�⺻�̷�;

public class �迭1_�⺻�̷�3_�⺻����2_���� {
	/*
	 * 	array = {10,20,30,40,50};
	 * 
		[����1] 4�� ����� ����Ѵ�.
		[��] 20 40
		
		[����2] 4�� ����� ���� ����Ѵ�.
		[��] 60
		
		[����3] 4�� ����� ������ ����Ѵ�.
		[��] 2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {10, 20, 30, 40, 50};
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 4 == 0) {
				System.out.println(array[i] + " ");
			}
		}
		System.out.println();
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			total += array[i];
			System.out.println("stacking... : " + total);
		}
		
		System.out.println("Total : " + total);
		
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 4 == 0) {
				count += 1;
			}
		}
		
		System.out.println("���� : " + count);
	}

}

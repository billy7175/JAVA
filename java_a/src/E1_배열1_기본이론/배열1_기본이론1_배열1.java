package E1_�迭1_�⺻�̷�;

public class �迭1_�⺻�̷�1_�迭1 {
	/*
	 * [1] [�迭] (array)
	 * [2] int[] arr = new int[3];
	 * [3] �ε��� (index)
	 *     0 ���� ���������� 1�� �����Ǹ鼭 ũ�⸸ŭ ���ȣ�� �����.
	 * 	   int [] arr = new int[5]; ==> 0, 1, 2, 3, 4
	 * 
	 * [4] �迭�� �ڵ����� 0�� ����ȴ�
	 * [5] arr[0] = 10 /// ������ ���ȣ�� ���� �����Ѵ�.
	 * [6] arr[3] = 10 // ���� �濡 ���� �����ϸ� ��������.
	 * [7] �迭�� 0 ��� null �ʱ�ȭ�Ѵ�.
	 * 
	 * */ 
	public static void main(String[] args) {
		int a = 10;
		int[] arr = new int[3];
		arr[0] = 10;
		arr [2] = 20;
		// arr[3] = 30; �� ��ȣ�� �����ؾ��Ѵ�.
		
//		int b;
//		System.out.println();
		int [] brr = new int[3];
		System.out.println(brr[2]);
		int [] ccr = null;
		System.out.println(ccr);
		
	}

}

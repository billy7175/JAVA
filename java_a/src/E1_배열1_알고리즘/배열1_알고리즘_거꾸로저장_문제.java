package E1_�迭1_�˰���;

public class �迭1_�˰���_�Ųٷ�����_���� {
	/*
	 * a = { 1,2,3,4,5 };
	 * 
	 * [����] a �迭�� ���� b �迭�� �ϳ��� �����ϴµ� ������ �Ųٷ� ���� 
	 * [��]   b = {5,4,3,2,1};
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int temp[] = new int[5];
		int index = arr.length-1;
		
		for(int i=0; i < arr.length; i++) {
			temp[index] = arr[i];
			index -= 1;
			System.out.println("�� �� : "+ temp[i]);
		}
		
		System.out.println("--------------------------------");
		for(int i=0; i<arr.length; i++) {
			System.out.println("�� �� : "+ temp[i]);
		}
	}

}

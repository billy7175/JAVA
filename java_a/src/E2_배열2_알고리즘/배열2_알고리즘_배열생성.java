package E2_�迭2_�˰���;

import java.util.Arrays;

public class �迭2_�˰���_�迭���� {

	/*
	 * [����]
	 *    [4�� ����� ����]
	 * - 	[����1] arr �迭���� 4�� ����� ��� temp �迭�� ����
	 * - ��! temp �� ���̸� 4�� ����� ���� ��ŭ�� �����Ѵ�.
	 * - ��) 4�ǹ�� ������ 3���̹Ƿ� temp = new int[3];  
	 */
	public static void main(String[] args) {
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		int count = 0;
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] % 4 ==0) {
				count += 1;
			}
		}
		
		System.out.println(count);
		temp = new int[count];
		
		int ti =0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[ti] % 4 == 0) {
				temp[ti] = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(temp));
		
	}

}

package E2_�迭2_�⺻�̷�;

import java.util.Arrays;

public class �迭2_�⺻�̷�3_������� {
	/*
	 *  �迭�� ��ü���� ����ϱ⽬�� ��� 
	 *  (��) arr1[] = {1,2,3,4};
	 * 
	 *  [1] import java.util.Arrays; 
	 *  [2] Arrays.toString(arr1)
	 *  
	 *  ���� ���δ� �Ʒ��Ͱ��� ��������ִ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		for(int i=0; i < arr.length; i++) {
			if(i < arr.length -1) {
				System.out.print(arr[i] + ",");
			} else {
				
				System.out.print(arr[i]);
			}
		}
		System.out.println("----------------");
		System.out.println(Arrays.toString(arr));
	}

}

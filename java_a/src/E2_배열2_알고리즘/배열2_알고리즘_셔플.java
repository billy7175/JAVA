package E2_�迭2_�˰���;
import java.util.Arrays;
import java.util.Random;
public class �迭2_�˰���_���� {
	/*
	[����] 	
	 1) �ε��� 2���� ����(0~5)���� �����ϰ� �� �ε����� ���� ��ȯ�Ѵ�.
	 2) �� 1���� 10 �� �ݺ��ϸ� ����  ��� 		
	��) 1 , 2 ==> {10,30,20,40,50,60};  // 20 �� 30�� ��ȯ�ȴ�.		
	��) 4 , 1 ==> {10,50,20,40,30,60};  // 50 �� 30�� ��ȯ�ȴ�.	
	��) 3 , 3 ==> {10,50,20,40,30,60}; // ������ �ƹ��ϵ��Ȼ����.
	...
*/
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		Random ran = new Random();
		for(int i=0;  i< 1000; i++) {
			int r = ran.nextInt(arr.length);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
			System.out.println(Arrays.toString(arr));
		}	
		
//		int arr[] = {10,20,30,40,50,60};
//		Random ran = new Random();
//		
//		for(int i = 0; i < 1000; i++) {
//			int r1 = ran.nextInt(arr.length);
//			int r2 = ran.nextInt(arr.length);
//			
//			int temp = arr[r1];
//			arr[r1] = arr[r2];
//			arr[r2] = temp;
//			System.out.print(r1 + " " + r2 + " : ");
//		}
	}

}

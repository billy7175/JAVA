package D3_�ݺ���_�˰���_LV1;

public class D3_����ǰ���_���� {
	/*
	  [����] 
	  		1 ���� 200 ������ ������ ���� ���ǿ� �´� ���ڸ� ���.
	      	[����1] 6�� ����߿��� 100�� ���尡��� ���� ��� 
	 		
	 		���� : 102
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		boolean run = true;
		while(run == true) {
			System.out.println("num" + num);
			if(num % 6 == 0 && num >= 100) {
				run = false;
			} else {				
				num = num + 1;
			}
		}
		System.out.println("-------------------");
		int left = num - 6;
		int right = num;
		left = 100 - left; // 4
		right= right -100; // 2
		if(left < right) {
			System.out.println(num - 6);
		} else {
			System.out.println(num);
		}
	}

}

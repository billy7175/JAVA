package D7_�ݺ���_�˰���_LV3;

public class D7_�Ҽ�ã��_���� {

	public static void main(String[] args) {
		int num = 100;
		int count = 0;
		int i = 1;
		while (i <= num) {
			if(num % i == 0 ) {
				count +=1;
			}
			i += 1;
		}
		if(count == 2) {
			System.out.println(num + "�� �Ҽ���.");
		} else {
			System.out.println(num + "�� �Ҽ��� �ƴϴ�.");
		}
		
		

	}

}

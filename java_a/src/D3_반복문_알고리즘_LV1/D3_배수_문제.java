package D3_�ݺ���_�˰���_LV1;

public class D3_���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int count = 0;
		int num = 1;
		while(run == true) {
			if(count == 3) {
				run = false;
			} else {
				if(num % 7 == 0) {
					System.out.println(num);
					count = count +1;
				}
				num = num +1;
			}
		}
	}

}

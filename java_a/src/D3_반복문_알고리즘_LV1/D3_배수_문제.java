package D3_반복문_알고리즘_LV1;

public class D3_배수_문제 {

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

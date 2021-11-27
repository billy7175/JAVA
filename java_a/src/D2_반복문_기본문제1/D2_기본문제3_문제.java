package D2_반복문_기본문제1;

public class D2_기본문제3_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		while(i >= 1) {
//			System.out.println(i);
			if(i >= 3 && i <= 6) {
				System.out.println("안녕");
			} else {
				System.out.println(i);
			}
			i = i - 1;
		}
	}

}

package D5_반복문_기본이론2;

public class D5_기본이론5_for무한1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 0;
//		for(int run = 1; run == 1;) {
//			System.out.println(n);
//			if(n >= 4) {
//				run = 0;
//			}
//			n += 1;
//		}
		
		int i = 0;
		for(;;) {
			System.out.println("~~");
			System.out.println(i);
			if(i > 10) {
				break;
			}
			i += 1;
		}
	}

}

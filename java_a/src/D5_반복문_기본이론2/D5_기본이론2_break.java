package D5_반복문_기본이론2;

public class D5_기본이론2_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int a = 1;
		while(run == true) {
			if(a > 5) {
				System.out.println(a);
				break;
			}
			a += 1;
		}
	}

}

package E1_배열1_기본이론;

public class 배열1_기본이론2_배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println("-----------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		
		int [] temp = {10,20,30};
		// temp = {40, 50 , 60};
		temp[0] = 40;
		temp[1] = 50;
		temp[2] = 60;
		System.out.println("------------------------------");
	}

}

package E1_배열1_알고리즘;

public class 배열1_알고리즘_거꾸로저장_문제 {
	/*
	 * a = { 1,2,3,4,5 };
	 * 
	 * [문제] a 배열의 값을 b 배열에 하나씩 저장하는데 순서를 거꾸로 저장 
	 * [예]   b = {5,4,3,2,1};
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int temp[] = new int[5];
		int index = arr.length-1;
		
		for(int i=0; i < arr.length; i++) {
			temp[index] = arr[i];
			index -= 1;
			System.out.println("들어간 값 : "+ temp[i]);
		}
		
		System.out.println("--------------------------------");
		for(int i=0; i<arr.length; i++) {
			System.out.println("들어간 값 : "+ temp[i]);
		}
	}

}

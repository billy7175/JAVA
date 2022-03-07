
public class Ex04ControlStatement5 {

	public static void main(String[] args) {
		
		//1. 0 ~ 100 사이의 3개의 난수(정수)를 만들어서 변수에 저장
		int n1 = (int)(Math.random() * 100); // (0 ~ 1) * 100
		int n2 = (int)(Math.random() * 100); // (0 ~ 1) * 100
		int n3 = (int)(Math.random() * 100); // (0 ~ 1) * 100
		System.out.printf("[%d][%d][%d]\n", n1, n2, n3);
		//System.out.println();// 단순 줄바꿈
		
		//2. 세개의 숫자 중 가장 큰 숫자를 찾아서 다른 변수에 저장
		int max = n1;
		if (max < n2) {
			max = n2;
		}
		if (max < n3) {
			max = n3;
		}
		
		//3. 찾은 변수를 출력 [MAX : 78]
		System.out.printf("[MAX : %d]\n\n", max);
		
		/////////////////////////////////////////////////////////
		
		//1. 0 ~ 10 사이의 3개의 난수(정수)를 만들어서 변수에 저장
		int x1 = (int)(Math.random() * 10); // (0 ~ 1) * 100
		int x2 = (int)(Math.random() * 10); // (0 ~ 1) * 100
		int x3 = (int)(Math.random() * 10); // (0 ~ 1) * 100
		System.out.printf("[%d][%d][%d]\n", x1, x2, x3);
		
		//2. 각 데이터의 중복 여부(true / false)를 변수에 저장
		boolean isDup = false;
		if (x1 == x2 || x2 == x3 || x3 == x1) {
			isDup = true;
		}
		
		//3. 결과 출력 [중복된 데이터가 있습니다/없습니다]
		if (isDup == true) {
			System.out.println("중복된 데이터가 있습니다");
		} else {
			System.out.println("중복된 데이터가 없습니다");
		}
	}

}











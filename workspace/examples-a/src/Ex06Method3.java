
public class Ex06Method3 {

	public static void main(String[] args) {
		
		int result = sum(10, 20); // 호출 : 함수 이름 + 전달인자의 자료형과 갯수를 사용해서 호출할 함수를 결정	
		System.out.println(result);
		
		result = sum(10, 20 ,30);
		System.out.println(result);
			
	}	
	//메서드 오버로딩 : 함수의 이름은 같지만 전달인자의 종류와 갯수를 다르게해서 서로 다른 함수로 사용
	static int sum(int n1, int n2) {		
		
		int result = n1 + n2;
		
		//함수를 종료하고(return) result의 값을 호출한 곳으로 반환
		return result; 
	}	
	static int sum(int n1, int n2, int n3) {
		
		int result = n1 + n2 + n3;
		
		//함수를 종료하고(return) result의 값을 호출한 곳으로 반환
		return result; 
	}
	

}

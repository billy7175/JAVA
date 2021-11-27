package D6_반복문_기본이론3;

public class D6_기타이론3_증감연산자 {
	/*
	 * 	[증감연산자] 
	 * 	
	 *   [1] ++a    
	 *   	- 먼저 a에 1이 더해지고 출력된다.
	 *   
	 *   [2] a++
	 *   	- 먼저 a가 출력되고나서 1이더해진다. 	
			 연산자 우선순위에 의해서 
			 ++을 변수 뒤에 붙이는건 우선순위가 가장낮아서 b가 먼저 출력되고나서 더하기 1이된다. 
			 이런걸이용해서 코드를 한줄정도줄일수는있으나, 권장하진않는다. 
			 정확히 코딩하는게 더 좋다. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println(++a);
		System.out.println(a);
		System.out.println("---------");
		int b = 10;
		System.out.println(b++);
		System.out.println(b);
		int c= 10;
		c+= 1;
		System.out.println(c);
	}

}

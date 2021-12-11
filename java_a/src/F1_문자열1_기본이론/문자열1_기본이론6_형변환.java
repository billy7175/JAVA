package F1_문자열1_기본이론;

public class 문자열1_기본이론6_형변환 {

	public static void main(String[] args) {
		//형변환(type conversion) ==> 자료형(data type)을 바꾸는 것을 의미
		
				// [1] 기본자료형 형변환하는방법 (자료형)변수		
				// 문자 -> 숫자
				char ch = 'a'; // 글자들도 사실 숫자로 되어있다. 
				int aNum = (int)ch;
				System.out.println(aNum);					// 97
				
				ch = (char)(aNum + 1);
				System.out.println(ch);						// b
					
				// [2] 문자열 형변환하는방법 특수함수를 사용해야한다.	
				// 문자열 -> 숫자
				String strNum = "10";
				int num = Integer.parseInt(strNum);
				System.out.println(num + 1);				// 11
				
				// 숫자 -> 문자열
				// 방법1) 꼼수
				strNum = num + "";
				System.out.println(strNum + 1);				// 101
				// 방법2) 정식
				strNum = String.valueOf(num);
				System.out.println(strNum + 1);				// 101
	}

}

package F1_문자열1_기본이론;

public class 문자열1_기본이론5_문자열함수 {

	public static void main(String[] args) {
		String str = "megait";
		System.out.println(str.length());
		
		int[] arr = new int[3];
		System.out.println(arr.length);
		
		//[2] 문자 한개 추출 charAt
		
		char c = str.charAt(1);
		System.out.println(c);
		
		//[3] 문자 여러개 추출 substring(시작번호, 끝번호)
		String s = str.substring(2,4);
		System.out.println(s);
		
		s = str.substring(2);
		System.out.println(s);
		
		//[4] split + 구분자;
		str = "hellom java, android";
		String temp[] = str.split(",");
		
		for(int i=0; i<temp.length; i++){
			System.out.println(temp[i]);
		}
		
		//[5] trim
		String s1 = "     hellp    world";
		s1 = s1.trim();
		System.out.println(s1);
		
		// [6]replaceAll
		String test = "abc";
//		test[0] = 'd'; 문자열은 숫자처럼 일부 수정이 불가능하다.
		test = test.replaceAll("ab", "dddddddddd");
		System.out.println(test);
		s1 = s1.replaceAll(" ", "");
		System.out.println(s1);
		
		
	}

}

package A1_기본이론;

public class A1_기본이론9_이스케이프문자 {	
	/*
	 * [1] 줄바꿈 \n 
	 * [2] 4칸 띄어스기 \t
	 * [3] \"
	 * [4] \'
	 * 
	 * */
	public static void main(String[] args) {
		System.out.print("abc\n");
		System.out.print("def");
		System.out.println();
		System.out.println("abc\tdef");
		System.out.println("\"안녕하세요.\"");
		System.out.println("\'안녕하세요.\'");
	}
}

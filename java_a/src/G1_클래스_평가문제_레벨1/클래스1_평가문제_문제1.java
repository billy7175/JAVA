package G1_클래스_평가문제_레벨1;

class Sample1{
	int arr[] = {10,20,30,40,50};
}

public class 클래스1_평가문제_문제1 {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};	
		Sample1 s1 = null;
			
		//문제) 답을 예상후 주석 풀고 실행		
		//System.out.println(s1.arr[0]);
		
		s1 = new Sample1();		
		Sample1 t1 = s1;		
		s1 = null;		
		System.out.println(t1.arr[0]);
		
		t1 = null;
		
	}
}

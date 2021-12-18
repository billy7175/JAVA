package G1_클래스_기본이론;

class Sample5{
	int arr[] = {1,2,3,4,5};
}
class Sample6{
	int arr[] = {5,4,3,2,1};
}

public class 클래스1_기본이론2_메모리구조6 {
	public static void main(String[] args) {
		
		Sample5 s5 = new Sample5();
		Sample6 s6 =new Sample6();
		s5.arr = s6.arr;
		s6.arr = s5.arr;
			
		
	}
}

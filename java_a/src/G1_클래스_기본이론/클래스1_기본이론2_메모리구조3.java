package G1_클래스_기본이론;


class Sample2 {
	int arr[] = { 10, 20, 30, 40, 50 };
	int a;
}

public class 클래스1_기본이론2_메모리구조3 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		Sample2 s2 = new Sample2();
		s2.arr = arr;

		System.out.println(s2.arr[0]);
		
		s2.arr = null;

	}
}

package B1_변수_기본이론;

public class B1_기본이론5_변수의값교체 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;
		temp = b;
		b = a;
		a = temp;
		System.out.println(a);
		System.out.println(b);
		
		
		int x = 10;
		int y = 20;
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println(x);
		System.out.println(y);
	}
}

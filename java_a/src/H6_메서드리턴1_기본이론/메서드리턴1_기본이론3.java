package H6_메서드리턴1_기본이론;

class TestReturn3{
	int num;
	
	void setNum(int a) {
		num = a;
	}	
	int getNum() {
		return num;
	}
}


public class 메서드리턴1_기본이론3 {
	  	
	public static void main(String[] args) {
		System.out.println("리턴을 사용하는경우와 안하는경우 ");
		
		TestReturn3 t1 = new TestReturn3();
		t1.setNum(10);
		
		//1) 사용하는경우
		System.out.println("1) 사용하는경우");
		int num1 = t1.getNum();
		System.out.println(num1);
		
		//2) 사용안하는경우
		System.out.println("2) 사용안하는경우");
		int num2 = t1.num;
		System.out.println(num2);
				
	}
}

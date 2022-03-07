
public class Ex04ControlStatement {

	public static void main(String[] args) {
		
		//Math.random() : 0 ~ 1 범위의 (double형) 난수 발생기
		double r = Math.random();
		//System.out.println( r );
		
		int number = (int)(r * 900) + 100; // 100 ~ 1000 범위의 정수
		System.out.println( number );
		
		if (number > 800) { // number가 800보다 크다면
			System.out.println("number는 800보다 큽니다.");
		}
		
		System.out.println("*********************************");
		
		if (number > 800) { // number가 800보다 크다면
			System.out.println("number는 800보다 큽니다.");
		} else { // number가 800보다 작거나 같은 경우
			System.out.println("number는 800보다 작거나 같습니다.");
		}
		
		System.out.println("*********************************");
		
		if (number >= 800) { 
			System.out.println("number는 800 ~ 1000.");
		} else if (number >= 600) { 
			System.out.println("number는 600 ~ 800.");
		} else if (number >= 400) { 
			System.out.println("number는 400 ~ 600.");
		} else if (number >= 200) { 
			System.out.println("number는 200 ~ 400.");
		} else { 
			System.out.println("number는 0 ~ 200.");
		}
	}

}

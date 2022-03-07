
public class Ex06Method {

	public static void main(String[] args) {
				
		//메서드 호출 - 메서드의 코드가 실행되도록 요청
		drawBox();
		drawBox();
		
		//영역
		{
			int y = 30;
			{
				int x = 10;
			}
			{
				// x = 20;//오류 - 다른 영역의 변수 사용X
				y = 30; //상위 영역의 변수 사용 가능
				int z = 40;
			}
			//z = 50; //오류 - 하위 영역의 변수 사용 X
		}

	}

	// 함수 정의 : 코드를 재사용 가능한 관리 단위로 구성
	private static void drawBox() {
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 20; x++) {
				if (x == 0 || x == 20 - 1 || 
					y == 0 || y == 10 - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}			
			System.out.println();
		}
	}


}

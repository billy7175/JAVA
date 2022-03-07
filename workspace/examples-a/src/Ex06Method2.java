
public class Ex06Method2 {

	public static void main(String[] args) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("박스 그리기에 사용할 문자 : ");
		String s = scanner.nextLine();
		
		System.out.print("박스의 너비 : ");
		int width = scanner.nextInt();
		System.out.print("박스의 높이 : ");
		int height = scanner.nextInt();
		
		//메서드 호출 - 메서드의 코드가 실행되도록 요청
		drawBox(s, width, height);
		
		scanner.close();
	}
	//메서드 정의 - 메서드 만들기
	static void drawBox(String s, int width, int height) {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				if (x == 0 || x == width - 1 || 
					y == 0 || y == height - 1) {
					System.out.print(s);
				} else {
					System.out.print(" ");
				}
			}			
			System.out.println();
		}
	}
	

}

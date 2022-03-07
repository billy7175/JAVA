
public class Ex04ControlStatement9 {

	public static void main(String[] args) {
		
		//1.
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < y + 1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//2-1
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {				
				if ( x < (10 - y - 1) ) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}				
			}			
			System.out.println();
		}
		//2-2
		for (int y = 0; y < 10; y++) {

			for (int x = 0; x < (10 - y - 1); x++) {
					System.out.print(" ");
			}
			for (int x = 0; x < y + 1; x++) {
				System.out.print("*");
			}			
			System.out.println();
			
		}
		
		//3
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











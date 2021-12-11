package F1_문자열1_기본이론;

public class 문자열1_기본이론7_문자열포맷 {

	public static void main(String[] args) {
		
		//문자열은 + 로 연결할수있다. 
		String menu = "";
		menu += "======롯데리아=====";
		menu += "\n";
		menu += "1)햄버거 200원";
		menu += "\n";
		menu += "2)콜라 1200원";
		menu += "\n";
		menu += "3)감자튀김 1300원";
		System.out.println(menu);
		
		System.out.println("----------------------");
		
		
		String name[] = { "aaa" , "bbbbbbbb" , "c"};
		int total[] = { 271 , 200, 24};
		double avg[] = new double[3];
		for(int i = 0; i < 3; i++) {
			avg[i] = (double)total[i] / 3;
		}		
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("[%10s] [%5d] [%6.2f]",
					name[i] , total[i] , avg[i]);
			System.out.println();
		}
		System.out.println("---------------------------------------");
		// - 는 왼쪽정렬 
		for(int i = 0; i < 3; i++) {
			System.out.printf("[%-10s] [%-5d] [%-6.2f]",
					name[i] , total[i] , avg[i]);
			System.out.println();
		}
		System.out.println("---------------------------------------");
		//String.format(); //단순히 출력이 아니라 문자열로 저장하고싶을때 사용 
		
		String data = "";
		for(int i = 0; i < 3; i++) {
			data += String.format("[%-10s] [%-5d] [%-6.2f]",
					name[i] , total[i] , avg[i]);
			data +="\n";
		}
		System.out.println(data);
		System.out.println("---------------------------------------");
	}
}
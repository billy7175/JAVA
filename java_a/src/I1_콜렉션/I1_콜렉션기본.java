package I1_콜렉션;
import java.util.ArrayList;

public class I1_콜렉션기본 {

	public static void main(String[] args) {
		//고정배열, 가변배열
		ArrayList<String> strList = new ArrayList<String>();
		
		String[] testList = new String[100];
		
		int count = 0;
		
		// 추가
		testList[count] = "aaaa";
		count += 1;
		
		testList[count] = "bbbb";
		count += 1;
		
		testList[count] = "Cccc";
		count += 1;
		
		
		// 추가2
		strList.add("aaa"); 
		strList.add("bbb"); 
		strList.add("c");
		
//		for(int i=0; i < count; i++) {
//			System.out.println(testList[i]);
//		}
//		
//		for(int i=0; i<strList.size(); i++) {
//			System.out.println(strList.get(i));
//		}
		
		// 삭제
		System.out.println("삭제 -------------");
		int remove = 1;
		count -= 1;
		for(int i= remove; i < count -1; i++) {
			testList[i] = testList[i + 1];
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(testList[i]);
		}
		
		System.out.println("-----------------");
		
		//삭제2
		strList.remove(remove);
		//출력2
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
				
		
	}

}

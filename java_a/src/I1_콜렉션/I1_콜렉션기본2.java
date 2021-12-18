package I1_콜렉션;
import java.util.ArrayList;
public class I1_콜렉션기본2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(10);
		intList.add(20);
		intList.add(30);
		
		// 삭제 remove(인덱스)
		intList.remove(1);
		
		// 수정 set(인덱스, 변경할 값)
		intList.set(1, 50); // 30 ==> 50
		
		//출력 SIZE(), GET(인덱스)
		for(int i =0; i< intList.size(); i++){
			System.out.println(intList.get(i));
		}
	}
}

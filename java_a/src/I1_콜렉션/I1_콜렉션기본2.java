package I1_�ݷ���;
import java.util.ArrayList;
public class I1_�ݷ��Ǳ⺻2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(10);
		intList.add(20);
		intList.add(30);
		
		// ���� remove(�ε���)
		intList.remove(1);
		
		// ���� set(�ε���, ������ ��)
		intList.set(1, 50); // 30 ==> 50
		
		//��� SIZE(), GET(�ε���)
		for(int i =0; i< intList.size(); i++){
			System.out.println(intList.get(i));
		}
	}
}

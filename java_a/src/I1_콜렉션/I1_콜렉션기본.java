package I1_�ݷ���;
import java.util.ArrayList;

public class I1_�ݷ��Ǳ⺻ {

	public static void main(String[] args) {
		//�����迭, �����迭
		ArrayList<String> strList = new ArrayList<String>();
		
		String[] testList = new String[100];
		
		int count = 0;
		
		// �߰�
		testList[count] = "aaaa";
		count += 1;
		
		testList[count] = "bbbb";
		count += 1;
		
		testList[count] = "Cccc";
		count += 1;
		
		
		// �߰�2
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
		
		// ����
		System.out.println("���� -------------");
		int remove = 1;
		count -= 1;
		for(int i= remove; i < count -1; i++) {
			testList[i] = testList[i + 1];
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(testList[i]);
		}
		
		System.out.println("-----------------");
		
		//����2
		strList.remove(remove);
		//���2
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
				
		
	}

}

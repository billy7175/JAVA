package F1_���ڿ�1_�⺻�̷�;

public class ���ڿ�1_�⺻�̷�5_���ڿ��Լ� {

	public static void main(String[] args) {
		String str = "megait";
		System.out.println(str.length());
		
		int[] arr = new int[3];
		System.out.println(arr.length);
		
		//[2] ���� �Ѱ� ���� charAt
		
		char c = str.charAt(1);
		System.out.println(c);
		
		//[3] ���� ������ ���� substring(���۹�ȣ, ����ȣ)
		String s = str.substring(2,4);
		System.out.println(s);
		
		s = str.substring(2);
		System.out.println(s);
		
		//[4] split + ������;
		str = "hellom java, android";
		String temp[] = str.split(",");
		
		for(int i=0; i<temp.length; i++){
			System.out.println(temp[i]);
		}
		
		//[5] trim
		String s1 = "     hellp    world";
		s1 = s1.trim();
		System.out.println(s1);
		
		// [6]replaceAll
		String test = "abc";
//		test[0] = 'd'; ���ڿ��� ����ó�� �Ϻ� ������ �Ұ����ϴ�.
		test = test.replaceAll("ab", "dddddddddd");
		System.out.println(test);
		s1 = s1.replaceAll(" ", "");
		System.out.println(s1);
		
		
	}

}

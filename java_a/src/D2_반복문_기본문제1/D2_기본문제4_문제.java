package D2_�ݺ���_�⺻����1;

public class D2_�⺻����4_���� {
	/*
    
	 [����] �Ʒ������� �溹�ϴ� ���� �ۼ��Ͻÿ�.
	  [����1] 1~10���� �ݺ����� �����Ѵ�.
	  [����2] ���ڰ� ¦���ϋ��� "¦��" ����Ѵ�.
	  [����2] ���ڰ� Ȧ���ϋ��� "Ȧ��" ����Ѵ�.
	 
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 10 ) {
			if(i % 2 == 0 ) {
				System.out.println(i);
				System.out.println("¦��");
			} else {
				System.out.println(i);
				System.out.println("Ȧ��");
			}
//			System.out.println(i);
			i = i +1;
		}
	}

}

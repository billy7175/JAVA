package D4_�ݺ���_�˰���_LV2;

public class D4_������_���� {
	/*
	 * [����]
		�б����� ������ ���� �ü� 15km�� �����Ÿ� Ÿ�� ����, 
		�ü� 6km�� �ɾ�°ź��� 18�� ���� �����Ѵٰ� �Ѵ�.
		�б����� �������� �Ÿ��� ���Ͻÿ�.
	 */

	public static void main(String[] args) {
//		double ������ = 15 / 60.0;
//		double �ȱ� = 6 / 60.0;
//		int a = 0;
//		boolean run = true;
//		while(run) {
//			if(a * ������ == �ȱ� + 18 *�ȱ�) {
//				System.out.println(a + "" + a* ������ );
//				run = false;
//			} else {
//				a += 1;
//			}
//		}
		double ������ = 15/60.0;
		double �ȱ� = 6/60.0;	
		int a = 0;
		boolean run = true;
		while(run) {
//			if(a * ������ == a * �ȱ� + 18 * �ȱ�) {
			if(a * ������ == a * �ȱ� + �ȱ� * 18) {
				System.out.println(a + " " + a * ������);
				System.out.println(a + "��" + "�Ÿ�" + (������ * a));
				run = false;
			}else {
				a += 1;
			}
			
		}
		
	}

}

package D4_�ݺ���_�˰���_LV2;

public class D4_������_���� {
	/*
	  [����]
		ö���� ������ x �� y �������� �����Ÿ� Ÿ�� �պ��Ͽ���. 
		������ �ü�15km , �ö��� �ü�12km �� �̵��Ͽ� ��  45���� �ɷ����� , 
		�������� x , y �Ÿ��� ���Ͻÿ�.
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double �����м� = 15/60.0;
		double �ö��м� = 12/60.0;
		
		int a = 45;
		int b = 0;
		
		// �����м� * a �� + �ö��м� * b ( a +  b == 45)
		
		boolean run = true;
		while(run == true) {
			if(�����м� * a == �ö��м� * b ) {
				System.out.println(a + "�� / " +b + "��");
				run = false;
			}
			a -= 1;
			b += 1;
		}
	}

}

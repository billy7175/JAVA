package D4_�ݺ���_�˰���_LV2;

public class D4_�����_���� {

	/*
	 * [����]
			  �Ʒ��Ͱ��� �޴������� �ִ� 
			  B�� �����Ұ�� A���� �� �������̵ɷ���,
			  ��ȭ�ð��� �󸶱��� ����ؾߵɱ��? 
			  ������ �ʷ� ���Ͻÿ�.
			  A����� �⺻��� 17500�� �ʴ� 5�� 
			  B����� �⺻��� 31000�� �ʴ� 2��
		  
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 17500;
		int b = 31000;
		int a�߰� = 0;
		int b�߰� = 0;
		boolean run = true;
		while(run == true) {
			if(a + a�߰� > b + b�߰� ) {
				System.out.println(a�߰� / 5);
				System.out.println(b�߰� /2);
				run = false;
			}
			a�߰� = a�߰� +5;
			b�߰� = b�߰� +2;
		}

	}
}

package H1_�޼���_�⺻�̷�;

//�ż��� �⺻���� 
// ����
// 1) void 				==> Ű����
// 2) testPrint() 		==> �̸�
// 3) {���}             ==> ����Ǵ� ���� 
	
// ����
// t1.testPrint();
// 1) t1     ==> Ŭ����������
// 2) .testPrint(); ==> .�Լ��̸�();
class Test{	
	int a;
	
	void testPrint() {
		System.out.println("!!");
	}
}
public class �޼���1_�⺻�̷�1 {
	
	public static void main(String[] args) {
		Test test = new Test();
		test.a = 10;
		test.testPrint();
		test.testPrint();
		test.testPrint();
		test.testPrint();
	}
}

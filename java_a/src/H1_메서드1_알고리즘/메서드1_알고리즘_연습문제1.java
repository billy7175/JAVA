package H1_�޼���1_�˰���;

class Test1 {
	void printEvenOrOdd(int x) {
		if(x % 2 == 1) {
			System.out.println("Ȧ��");
		}
	}
	void sumBetweenValues(int x, int y) {
	}

	void printPrimeNums(int primeNumber) {
		
	}
}

public class �޼���1_�˰���_��������1 {
	public static void main(String[] args) {
		Test1 test = new Test1();
		// ���� 1) a �� Ȧ������ ¦������ ��� 
		int a = 19;
		test.printEvenOrOdd(a);

		// ���� 2) x���� y������ ���� ����ϴ� �޼���
		int x = 1;
		int y = 10;
		test.sumBetweenValues(x, y);

		// ����3) ���� 1���� ���ڷ� ����ؼ� 2���� ���ڱ�����  �Ҽ� ���� ��� 
		int primeNumber = 20;
		
	
	}
}

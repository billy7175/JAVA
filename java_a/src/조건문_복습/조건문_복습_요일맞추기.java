package ���ǹ�_����;

import java.util.Random;

public class ���ǹ�_����_���ϸ��߱� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int day = ran.nextInt(31) + 1;
		int week = day % 7;
		if(week == 1) {
			System.out.println("������");
		}
		if(week == 2) {
			System.out.println("�����");
		}
		if(week == 3) {
			System.out.println("�ݿ���");
		}
		if(week == 4) {
			System.out.println("�����");
		}
		if(week == 5) {
			System.out.println("�Ͽ���");
		}
		if(week == 6) {
			System.out.println("������");
		}
		if(week == 0) {
			System.out.println("ȭ����");
		}
	
	}

}

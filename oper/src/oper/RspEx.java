package oper;

import java.util.Scanner;

public class RspEx {

	public static void main(String[] args) {
		System.out.println("3������");
		System.out.println("������ 0 ������ 1 ���ڱ�� 2 : ");
		int YourCost = 0;int ComCost = 0;
		int Computer; int User;
		Scanner Rsp = new Scanner(System.in);

		for (; YourCost < 3 && ComCost < 3;) {
			User = Rsp.nextInt();
			Computer = (int)(Math.random()*3);
			switch (User) {
			case 0:
				if (Computer == 1) {
					System.out.println("�����ϴ�.");
					ComCost++;
					System.out.println("�� : " + YourCost + "�� ��ǻ�� : "  + ComCost + "��");
				} else if(Computer == 0) {
					System.out.println("�����ϴ�.");
					System.out.println("�� : " + YourCost + "�� ��ǻ�� : "  + ComCost + "��");
				} else if(Computer == 2) {
					System.out.println("�̰���ϴ�.");
					YourCost++;
					System.out.println("�� : " + YourCost + "�� ��ǻ�� : "  + ComCost + "��");
				}
				break;
			case 1:
				if (Computer == 1) {
					System.out.println("�����ϴ�.");
					System.out.println("�� : " + YourCost + "�� ��ǻ�� : "  + ComCost + "��");
				} else if(Computer == 0) {
					System.out.println("�̰���ϴ�.");
					YourCost++;
					System.out.println("�� : " + YourCost + "�� ��ǻ�� : "  + ComCost + "��");
				} else if(Computer == 2) {
					System.out.println("�����ϴ�.");
					ComCost++;
					System.out.println("�� : " + YourCost + "�� ��ǻ�� : "  + ComCost + "��");
				}
				break;
			case 2:
				if (Computer == 1) {
					System.out.println("�̰���ϴ�.");
					YourCost++;
					System.out.println("�� : " + YourCost + "�� ��ǻ�� : "  + ComCost + "��");
				} else if(Computer == 0) {
					System.out.println("�����ϴ�.");
					ComCost++;
					System.out.println("�� : " + YourCost + "�� ��ǻ�� : "  + ComCost + "��");
				} else if(Computer == 2) {
					System.out.println("�����ϴ�.");
					System.out.println("�� : " + YourCost + "�� ��ǻ�� : "  + ComCost + "��");
				}
				break;
			default:
				System.out.println("�ٸ��ų� �� ����");
				ComCost++;
				break;
			}
		}
		
		if (YourCost>ComCost) {
			System.out.println("�� : " + YourCost + "�� ��ǻ�� : " + ComCost + "������ �� ��!");
		} else if(YourCost<ComCost){
			System.out.println("�� : " + YourCost + "�� ��ǻ�� : " + ComCost + "������ ��ǻ�� ��!");
		}
	}

}

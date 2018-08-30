package oper;

import java.util.Scanner;

public class RspEx {

	public static void main(String[] args) {
		System.out.println("3선승제");
		System.out.println("가위는 0 바위는 1 보자기는 2 : ");
		int YourCost = 0;int ComCost = 0;
		int Computer; int User;
		Scanner Rsp = new Scanner(System.in);

		for (; YourCost < 3 && ComCost < 3;) {
			User = Rsp.nextInt();
			Computer = (int)(Math.random()*3);
			switch (User) {
			case 0:
				if (Computer == 1) {
					System.out.println("졌습니다.");
					ComCost++;
					System.out.println("님 : " + YourCost + "점 컴퓨터 : "  + ComCost + "점");
				} else if(Computer == 0) {
					System.out.println("비겼습니다.");
					System.out.println("님 : " + YourCost + "점 컴퓨터 : "  + ComCost + "점");
				} else if(Computer == 2) {
					System.out.println("이겼습니다.");
					YourCost++;
					System.out.println("님 : " + YourCost + "점 컴퓨터 : "  + ComCost + "점");
				}
				break;
			case 1:
				if (Computer == 1) {
					System.out.println("비겼습니다.");
					System.out.println("님 : " + YourCost + "점 컴퓨터 : "  + ComCost + "점");
				} else if(Computer == 0) {
					System.out.println("이겼습니다.");
					YourCost++;
					System.out.println("님 : " + YourCost + "점 컴퓨터 : "  + ComCost + "점");
				} else if(Computer == 2) {
					System.out.println("졌습니다.");
					ComCost++;
					System.out.println("님 : " + YourCost + "점 컴퓨터 : "  + ComCost + "점");
				}
				break;
			case 2:
				if (Computer == 1) {
					System.out.println("이겼습니다.");
					YourCost++;
					System.out.println("님 : " + YourCost + "점 컴퓨터 : "  + ComCost + "점");
				} else if(Computer == 0) {
					System.out.println("졌습니다.");
					ComCost++;
					System.out.println("님 : " + YourCost + "점 컴퓨터 : "  + ComCost + "점");
				} else if(Computer == 2) {
					System.out.println("비겼습니다.");
					System.out.println("님 : " + YourCost + "점 컴퓨터 : "  + ComCost + "점");
				}
				break;
			default:
				System.out.println("다른거냄 짐 ㅅㄱ");
				ComCost++;
				break;
			}
		}
		
		if (YourCost>ComCost) {
			System.out.println("님 : " + YourCost + "점 컴퓨터 : " + ComCost + "점으로 님 승!");
		} else if(YourCost<ComCost){
			System.out.println("님 : " + YourCost + "점 컴퓨터 : " + ComCost + "점으로 컴퓨터 승!");
		}
	}

}

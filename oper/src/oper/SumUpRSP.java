package oper;

import java.util.Scanner;


public class SumUpRSP {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3선승제");
		System.out.println("가위 : 0 바위 : 1 보자기 : 2");
		int user,com;
		int UserCount = 0,ComCount = 0;
		
		for (; UserCount < 3 && ComCount < 3;) {
		
			user = scanner.nextInt();
			com = (int)(Math.random()*3);
			
			if (user < com) {
				user = user + 3;
			}
			int result = user - com;
			switch (result) {
			case 1:
				System.out.println("com : " + com + " You Win");
				System.out.println("User : " + ++UserCount + "점 Computer : " + ComCount);
				break;
			case 2:
				System.out.println("com : " + com + " You Lose");
				System.out.println("User : " + UserCount + "점 Computer : " + ++ComCount);
				break;
			case 0:
				System.out.println("com : " + com + " Draw");
				System.out.println("User : " + UserCount + "점 Computer : " + ComCount);
				break;
			default:
				System.out.println("잘못냄 짐 ㅅㄱ");
				System.out.println("User : " + UserCount + "점 Computer : " + ++ComCount);
				break;
			}
		}	
		if (UserCount > ComCount) {
			System.out.println("이겼습니다.");
		} else {
			System.out.println("졌습니다.");
		}			
	}
}

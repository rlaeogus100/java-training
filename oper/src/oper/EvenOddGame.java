package oper;

import java.util.Scanner;

public class EvenOddGame {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int value = (int)(Math.random()*2);
		
		System.out.println("¦���ϱ��? Ȧ���ϱ��?");
		
		int odd = value %2;
		int input = Scanner.nextInt();
		
		if(odd ==input) {
			System.out.println("����");
		}else {
			System.out.println("�ƴ�");
		}
	}
}

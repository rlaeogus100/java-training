package oper;

import java.util.Scanner;

public class EvenOddGame {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int value = (int)(Math.random()*2);
		
		System.out.println("Â¦¼öÀÏ±î¿ä? È¦¼öÀÏ±î¿ä?");
		
		int odd = value %2;
		int input = Scanner.nextInt();
		
		if(odd ==input) {
			System.out.println("¸ÂÀ½");
		}else {
			System.out.println("¾Æ´Ô");
		}
	}
}

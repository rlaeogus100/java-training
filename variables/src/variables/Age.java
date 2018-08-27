package variables;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
	int one,two,age;
	
	Scanner keyboard =new Scanner(System.in);
	one=keyboard.nextInt();
	two=keyboard.nextInt();
	
	
	age=one+two;
	
	System.out.println("나이는 : " + age + "입니다.");
	}
}
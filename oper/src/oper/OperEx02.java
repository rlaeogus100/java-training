package oper;

public class OperEx02 {

	public static void main(String[] args) {

		//자동증감연산자
		/*int i = 10;
		System.out.println(++i);*/
		 //++는 1를 더한다는 뜻 하지만 앞에 붙이면 먼저 더하고 작업을 실행하고 뒤에 붙이면 작업을 실행하고 더해짐
		 
		int i = 10;
		int j = 5;
		
		int c = i++ + j++ + ++i;
				//10 +  5  +   12 = 27
		System.out.println(c);
	}

}

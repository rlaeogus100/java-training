package variables;

public class Var {

	public static void main(String[] args) {
		//변수의 타입 - 메모리 공간의 크기, 어떤 종류를 담을지
		// 정수=int 숫자(소수) = double 문자 = String 참,거짓을 나타낼 때에는 (0,1) = boolean
		//byte,short,long,char
		//변수 명
		int i = 10;
		
		//처음만들때만 변수타입(int,string 등) 입력\
		int j = i;
		
		//store --> copy
		i=20;
		System.out.println(i);
		System.out.println(j);
		
	}

}

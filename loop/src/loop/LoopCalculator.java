package loop;

import java.util.Scanner;

public class LoopCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double current = 0;
		all:
		while (true) {
			
			System.out.print("add, min, mul, div, exit : ");
			
			String oper = scanner.nextLine();
			/*if (oper.equals("exit")) {
				//equals : 문자열은 비교가  ==으로 안됨 그래서 저 함수를 씀
				break;
			}*/
			System.out.print("value : ");
			double value = Double.parseDouble(scanner.nextLine());
			//nextLine는 엔터까지 인식 근데 밑에 있는애는 엔터는 인식을 안해서 엔터가 남음
			//그래서 엔터를 없애기 위해 nextLine로 만듬
			//Double.parseDouble()로 문자열 값을 double값으로 바꿈.
			//scanner.nextDouble();
			
			switch (oper) {
			case "add":
				current = current + value;
				break;
			case "min":
				current = current - value;
				break;
			case "mul":
				current = current * value;
				break;
			case "div":
				current = current / value;
				break;
			case "exit":
				break all;
			default:
				System.out.println("잘못 입력해서 값 변화 없음");
				break;
			}
			System.out.println("current : " + current);
		}
	}
}

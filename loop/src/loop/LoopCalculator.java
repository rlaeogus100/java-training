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
				//equals : ���ڿ��� �񱳰�  ==���� �ȵ� �׷��� �� �Լ��� ��
				break;
			}*/
			System.out.print("value : ");
			double value = Double.parseDouble(scanner.nextLine());
			//nextLine�� ���ͱ��� �ν� �ٵ� �ؿ� �ִ¾ִ� ���ʹ� �ν��� ���ؼ� ���Ͱ� ����
			//�׷��� ���͸� ���ֱ� ���� nextLine�� ����
			//Double.parseDouble()�� ���ڿ� ���� double������ �ٲ�.
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
				System.out.println("�߸� �Է��ؼ� �� ��ȭ ����");
				break;
			}
			System.out.println("current : " + current);
		}
	}
}

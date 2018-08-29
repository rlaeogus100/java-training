package oper;
public class OperEx03 {
	public static void main(String[] args) {
		
		double radius = 14;
		double area = (radius * radius) * Math.PI;
		
		System.out.println(area);
		
		//double 0에서 0.99999999999에 해당하는 값을 임의로 생성
		System.out.println((int)(Math.random() * 6)+1);
		//↑ 주사위
	}
}

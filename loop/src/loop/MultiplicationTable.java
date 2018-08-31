package loop;

public class MultiplicationTable {
	public static void main(String[] args) {
		for (int Front = 1; Front <= 9 ; Front++) {
			System.out.println(Front + "´Ü");
			for (int Back = 1; Back <= 9; Back++) {
				System.out.println(Front + " * " + Back + " = " + Front * Back);
			}
		}
	}
}

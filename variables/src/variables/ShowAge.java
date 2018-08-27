package variables;
import java.util.Calendar;
import java.util.Scanner;
public class ShowAge {
	public static void main(String[] args) {
		int birthyear,age,now;
		
		Scanner Year = new Scanner(System.in);
		
		birthyear=Year.nextInt();
		now=Calendar.getInstance().get(Calendar.YEAR);
		
		age = now - birthyear;
		
		System.out.println("나이는 : " + age + "입니다.");
	}
}

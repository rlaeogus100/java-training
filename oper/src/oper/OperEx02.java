package oper;

public class OperEx02 {

	public static void main(String[] args) {

		//�ڵ�����������
		/*int i = 10;
		System.out.println(++i);*/
		 //++�� 1�� ���Ѵٴ� �� ������ �տ� ���̸� ���� ���ϰ� �۾��� �����ϰ� �ڿ� ���̸� �۾��� �����ϰ� ������
		 
		int i = 10;
		int j = 5;
		
		int c = i++ + j++ + ++i;
				//10 +  5  +   12 = 27
		System.out.println(c);
	}

}

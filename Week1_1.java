//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Week1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		int count = -1;
		double sum = 0;
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���");
		do  {
			input = sc.nextInt();
			sum += input;
			count++;			
		}while(input != 0);
		
		System.out.println("�Է��� ���� ����: "+ count);
		System.out.println("��� : "+ (sum/count));
		
		sc.close();
	}

}

import java.util.Scanner;

public class Week1_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("500�� ���� ���� : ");
		int c500 = sc.nextInt();
		sum += 500 * c500;
		
		System.out.print("100�� ���� ����: ");
		int c100 = sc.nextInt();
		sum += 100 * c100;
		
		System.out.print("50�� ���� ����: ");
		int c50 = sc.nextInt();
		sum += 50 * c50;
		
		System.out.print("10�� ���� ����: ");
		int c10 = sc.nextInt();
		sum += 10 * c10;
		
		System.out.println("�ݾ��� "+ sum +"�� �Դϴ�.");
		
		sc.close();

	}

}

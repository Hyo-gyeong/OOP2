import java.util.Scanner;

public class Week2_4 {

	public static void main(String[] args) {

		Average avrg = new Average();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��ϼ���: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("�μ��� ��� : " + avrg.getAverage(n1, n2));
		
		System.out.print("�� ���� �Է��ϼ���: ");
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		
		System.out.println("������ ��� : " + avrg.getAverage(n3, n4, n5));
		
		sc.close();
	}

}

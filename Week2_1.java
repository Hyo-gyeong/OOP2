import java.util.Scanner;

public class Week2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		double sum = 0;
		
		System.out.print("������ �Է��ϼ���: ");
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			sum += num[i];		
		}
		
		System.out.println("���� " + sum);
		
		String[] name = new String[5];
		
		System.out.print("�̸��� �Է��ϼ���: ");
		for (int i = 0; i < 5; i++)
			name[i] = sc.next();
		System.out.print("�Էµ� �̸��� ");
		for (int i = 0; i < 5; i++)
			System.out.print(name[i] + " ");
		
		sc.close();
	}

}

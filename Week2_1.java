import java.util.Scanner;

public class Week2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		double sum = 0;
		
		System.out.print("정수를 입력하세요: ");
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			sum += num[i];		
		}
		
		System.out.println("합은 " + sum);
		
		String[] name = new String[5];
		
		System.out.print("이름을 입력하세요: ");
		for (int i = 0; i < 5; i++)
			name[i] = sc.next();
		System.out.print("입력된 이름은 ");
		for (int i = 0; i < 5; i++)
			System.out.print(name[i] + " ");
		
		sc.close();
	}

}

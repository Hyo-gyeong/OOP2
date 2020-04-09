import java.util.Scanner;

public class Week1_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("500원 동전 개수 : ");
		int c500 = sc.nextInt();
		sum += 500 * c500;
		
		System.out.print("100원 동전 개수: ");
		int c100 = sc.nextInt();
		sum += 100 * c100;
		
		System.out.print("50원 동전 개수: ");
		int c50 = sc.nextInt();
		sum += 50 * c50;
		
		System.out.print("10원 동전 개수: ");
		int c10 = sc.nextInt();
		sum += 10 * c10;
		
		System.out.println("금액은 "+ sum +"원 입니다.");
		
		sc.close();

	}

}

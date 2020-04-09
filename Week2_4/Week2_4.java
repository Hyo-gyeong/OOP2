import java.util.Scanner;

public class Week2_4 {

	public static void main(String[] args) {

		Average avrg = new Average();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하세요: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("두수의 평균 : " + avrg.getAverage(n1, n2));
		
		System.out.print("세 수를 입력하세요: ");
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		
		System.out.println("세수의 평균 : " + avrg.getAverage(n3, n4, n5));
		
		sc.close();
	}

}

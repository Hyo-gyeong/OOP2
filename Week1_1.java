//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Week1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		int count = -1;
		double sum = 0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		do  {
			input = sc.nextInt();
			sum += input;
			count++;			
		}while(input != 0);
		
		System.out.println("입력한 수의 개수: "+ count);
		System.out.println("평균 : "+ (sum/count));
		
		sc.close();
	}

}

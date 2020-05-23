import java.util.Scanner;

public class Assignment6_1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String calc = sc.next();
		
		switch(calc) {
		case("+"):
			new Add(a, b);
			break;
		case("-"):
			new Sub(a, b);
			break;
		case("*"):
			new Mul(a, b);
			break;
		case("/"):
			new Div(a, b);
			break;
		default:
			System.out.println("입력이 잘못되었습니다.");
			break;
		}
		
		sc.close();
	}

}

import java.util.Scanner;

public class Assignment6_1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
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
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			break;
		}
		
		sc.close();
	}

}

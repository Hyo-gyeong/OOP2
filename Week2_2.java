import java.util.Scanner;

public class Week2_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean keep = true;
		
		while(keep) {
			System.out.print("당신의 주민번호를 입력하세요. (012345-1234567) >> ");
			String ans = scan.next();
			
			if (ans.charAt(7) == '1' || ans.charAt(7) == '3')
				System.out.println("당신은 남자입니다.");
			else if (ans.charAt(7) == '2' || ans.charAt(7) == '4')
				System.out.println("당신은 여자입니다.");
			else
				System.out.println("유효하지 않은 주민번호입니다.");
			
			System.out.print("입력을 계속하시겠습니까? (y/n)");
			String again = scan.next();
			
			if (again.equals("n"))
				break;
		}
		
		scan.close();
	}

}

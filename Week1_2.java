import java.util.Scanner;

public class Week1_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		int c;
		boolean flag = true;
		
		while (flag){	
			System.out.print("문자를 입력하세요: ");
			s = sc.next();
			if (s.equals("0") == flag) //String형 비교하는 방법!
				break;
			c = s.charAt(0);
			
			if (c >= 'a' && c <= 'z') { //소문자 -> 대문자
				c = c - ('a' - 'A');
			}
			else if (c >= 'A' && c <= 'Z'){ //대문자 -> 소문자
				c = c + ('a' - 'A');
			}
			else {
				System.out.println("문자가 아닙니다.");
			}
			
			System.out.println((char)c);		
		}
		
		sc.close();
		
	}

}

import java.util.Scanner;

public class Week1_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		int c;
		boolean flag = true;
		
		while (flag){	
			System.out.print("���ڸ� �Է��ϼ���: ");
			s = sc.next();
			if (s.equals("0") == flag) //String�� ���ϴ� ���!
				break;
			c = s.charAt(0);
			
			if (c >= 'a' && c <= 'z') { //�ҹ��� -> �빮��
				c = c - ('a' - 'A');
			}
			else if (c >= 'A' && c <= 'Z'){ //�빮�� -> �ҹ���
				c = c + ('a' - 'A');
			}
			else {
				System.out.println("���ڰ� �ƴմϴ�.");
			}
			
			System.out.println((char)c);		
		}
		
		sc.close();
		
	}

}

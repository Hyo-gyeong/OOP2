import java.util.Scanner;

public class Week2_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean keep = true;
		
		while(keep) {
			System.out.print("����� �ֹι�ȣ�� �Է��ϼ���. (012345-1234567) >> ");
			String ans = scan.next();
			
			if (ans.charAt(7) == '1' || ans.charAt(7) == '3')
				System.out.println("����� �����Դϴ�.");
			else if (ans.charAt(7) == '2' || ans.charAt(7) == '4')
				System.out.println("����� �����Դϴ�.");
			else
				System.out.println("��ȿ���� ���� �ֹι�ȣ�Դϴ�.");
			
			System.out.print("�Է��� ����Ͻðڽ��ϱ�? (y/n)");
			String again = scan.next();
			
			if (again.equals("n"))
				break;
		}
		
		scan.close();
	}

}

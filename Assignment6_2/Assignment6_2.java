import java.util.Scanner;

public class Assignment6_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] if_sat = new int[] {0, 0, 0, 0, 0};
		
		If_Full check = new If_Full();
		PrintSeats ps = new PrintSeats(if_sat);
		
		do {
			System.out.print("�����Ϸ��� �¼���ȣ�� �Է��ϼ��� : ");
			int reservation = sc.nextInt();
			
			if (if_sat[reservation-1] == 1)
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			else {
				System.out.println("����Ǿ����ϴ�.");
				if_sat[reservation-1] = 1;
				ps.print_seats(if_sat);
			}
			
			
		}while(check.full_check(if_sat) == 0);
		
		System.out.println("�����Դϴ�.");
		
		sc.close();
		
	}

}

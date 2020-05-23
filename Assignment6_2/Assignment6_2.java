import java.util.Scanner;

public class Assignment6_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] if_sat = new int[] {0, 0, 0, 0, 0};
		
		If_Full check = new If_Full();
		PrintSeats ps = new PrintSeats(if_sat);
		
		do {
			System.out.print("예약하려는 좌석번호를 입력하세요 : ");
			int reservation = sc.nextInt();
			
			if (if_sat[reservation-1] == 1)
				System.out.println("이미 예약된 자리입니다.");
			else {
				System.out.println("예약되었습니다.");
				if_sat[reservation-1] = 1;
				ps.print_seats(if_sat);
			}
			
			
		}while(check.full_check(if_sat) == 0);
		
		System.out.println("만석입니다.");
		
		sc.close();
		
	}

}

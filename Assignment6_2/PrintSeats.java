
public class PrintSeats {

	PrintSeats(int[] if_sat){
		this.print_seats(if_sat);
	}
	
	public void print_seats(int[] if_sat){
		System.out.println("-------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.print(i+1 + "  ");
		}
		System.out.println("\n-------------------------------");
		for (int i: if_sat) {
			System.out.print(i + "  "); //if_sat[i]�̷��� �ϸ� �ȵ�!!
		}
		System.out.println("\n-------------------------------");
	}
}

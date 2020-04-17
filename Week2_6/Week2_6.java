import java.util.Scanner;

public class Week2_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Phone[] info = new Phone[2];
		
		for (int i = 0; i < 2; i++) {
			System.out.print("이름, 전화번호를 입력하세요. >> ");
			String name = sc.next();
			String pn = sc.next();
			
			info[i] = new Phone(name, pn);
			
			System.out.println(info[i].getName() + "의 번호는 "+ info[i].getTel());
		}
		
		sc.close();
		
	}

}

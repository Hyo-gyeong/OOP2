import java.util.Scanner;

public class Week2_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Phone[] info = new Phone[2];
		
		System.out.print("이름, 전화번호를 입력하세요. >> ");
		String name0 = sc.next();
		String pn0 = sc.next();
		
		info[0] = new Phone(name0, pn0);
		
		System.out.println(info[0].getName() + "의 번호는 "+ info[0].getTel());
		
		System.out.print("이름, 전화번호를 입력하세요. >> ");
		String name1 = sc.next();
		String pn1 = sc.next();
		
		info[1] = new Phone(name1, pn1);
		
		System.out.println(info[1].getName() + "의 번호는 "+ info[1].getTel());
		
		sc.close();
		
	}

}

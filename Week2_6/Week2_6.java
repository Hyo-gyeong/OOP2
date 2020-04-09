import java.util.Scanner;

public class Week2_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름, 전화번호를 입력하세요. >> ");
		String name1 = sc.next();
		String pn1 = sc.next();
		
		Phone info1 = new Phone(name1, pn1);
		System.out.println(info1.getName() + "의 번호는 "+ info1.getTel());
		
		System.out.print("이름, 전화번호를 입력하세요. >> ");
		String name2 = sc.next();
		String pn2 = sc.next();
		
		Phone info2 = new Phone(name2, pn2);
		System.out.println(info2.getName() + "의 번호는 "+ info2.getTel());
		
		sc.close();
		
	}

}

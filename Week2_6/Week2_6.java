import java.util.Scanner;

public class Week2_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�, ��ȭ��ȣ�� �Է��ϼ���. >> ");
		String name1 = sc.next();
		String pn1 = sc.next();
		
		Phone info1 = new Phone(name1, pn1);
		System.out.println(info1.getName() + "�� ��ȣ�� "+ info1.getTel());
		
		System.out.print("�̸�, ��ȭ��ȣ�� �Է��ϼ���. >> ");
		String name2 = sc.next();
		String pn2 = sc.next();
		
		Phone info2 = new Phone(name2, pn2);
		System.out.println(info2.getName() + "�� ��ȣ�� "+ info2.getTel());
		
		sc.close();
		
	}

}

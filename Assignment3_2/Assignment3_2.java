import java.util.Scanner;

public class Assignment3_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Book b = new Book();
		Magazine m = new Magazine();
		
		System.out.print("���� �̸���? ");
		m.setTitle(sc.next());
		System.out.print("������ ����? ");
		m.setPage(sc.nextInt());
		System.out.print("���ڴ�? ");
		m.setAuthor(sc.next());
		System.out.print("�߸�����? ");
		m.setRelease(sc.next());
		
		System.out.println(m.toString());
		
		sc.close();
	}

}

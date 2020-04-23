import java.util.Scanner;

public class Assignment3_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Book b = new Book();
		Magazine m = new Magazine();
		
		System.out.print("잡지 이름은? ");
		m.setTitle(sc.next());
		System.out.print("페이지 수는? ");
		m.setPage(sc.nextInt());
		System.out.print("저자는? ");
		m.setAuthor(sc.next());
		System.out.print("발매일은? ");
		m.setRelease(sc.next());
		
		System.out.println(m.toString());
		
		sc.close();
	}

}

import java.util.Scanner;
import java.util.ArrayList;

public class Assignment3_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Book> b = new ArrayList<Book>();
		
		System.out.print("å�� �Ǽ���? : ");
		int num = sc.nextInt();
		sc.nextLine();//nextInt()�� ���͸� �����ϱ� ������ �о ���ֱ�
		
		for (int i = 0; i < num; i++) {
			System.out.print("����>> ");
			String title = sc.nextLine();
			System.out.print("����>> ");
			String author = sc.nextLine();
			b.add(i, new Book(title, author));
		}
		for (int i = 0; i < num; i++) 
			System.out.println(b.get(i).toString());
		
		sc.close();
	}

}

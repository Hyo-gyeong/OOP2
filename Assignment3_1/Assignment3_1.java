import java.util.Scanner;
import java.util.ArrayList;

public class Assignment3_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<>();
		
		System.out.print("å�� �Ǽ�>> ");
		String input = sc.nextLine();
		int num = Integer.parseInt(input); //nextInt()�� ���͸� �� �ٸ� �Է����� �б⶧���� ���� = \n�Ǿ����
											//input�� ����� �������� ���ڿ��� ������ ��ȯ
											//parse : ���ڵ��� �ǹ�
		for (int i = 0; i < num; i++) {
			System.out.print("����>> ");
			String title = sc.nextLine();
			System.out.print("����>> ");
			String author = sc.nextLine();
			books.add(i, new Book(author, title));
		}
		for (int i = 0; i < num; i++) {
			System.out.print(books.get(i).toString());
		}
		
		System.out.print("\nã������ å�� ������>> ");
		String want = sc.next();
		
		int flag = 0;
		for (int i = 0; i < num; i++) {
			if (books.get(i).getTitle().equals(want) == true) {
				System.out.println("���ڴ�  : " + books.get(i).getAuthor());
				flag = 1;
				break;
			}
		}
		
		if (flag == 0)
			System.out.println("ã������ å�� �����ϴ�.");
		
		sc.close();
	}

}

import java.util.Scanner;
import java.util.ArrayList;

public class Assignment3_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Book> b = new ArrayList<Book>();
		
		System.out.print("책의 권수는? : ");
		int num = sc.nextInt();
		sc.nextLine();//nextInt()가 엔터를 저장하기 때문에 읽어서 없애기
		
		for (int i = 0; i < num; i++) {
			System.out.print("제목>> ");
			String title = sc.nextLine();
			System.out.print("저자>> ");
			String author = sc.nextLine();
			b.add(i, new Book(title, author));
		}
		for (int i = 0; i < num; i++) 
			System.out.println(b.get(i).toString());
		
		sc.close();
	}

}

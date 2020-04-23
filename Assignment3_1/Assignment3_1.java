import java.util.Scanner;
import java.util.ArrayList;

public class Assignment3_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<>();
		
		System.out.print("책의 권수>> ");
		String input = sc.nextLine();
		int num = Integer.parseInt(input); //nextInt()가 엔터를 또 다른 입력으로 읽기때문에 제목 = \n되어버림
											//input에 저장된 숫자형식 문자열을 정수로 변환
											//parse : 디코딩의 의미
		for (int i = 0; i < num; i++) {
			System.out.print("제목>> ");
			String title = sc.nextLine();
			System.out.print("저자>> ");
			String author = sc.nextLine();
			books.add(i, new Book(author, title));
		}
		for (int i = 0; i < num; i++) {
			System.out.print(books.get(i).toString());
		}
		
		System.out.print("\n찾으려는 책의 제목은>> ");
		String want = sc.next();
		
		int flag = 0;
		for (int i = 0; i < num; i++) {
			if (books.get(i).getTitle().equals(want) == true) {
				System.out.println("저자는  : " + books.get(i).getAuthor());
				flag = 1;
				break;
			}
		}
		
		if (flag == 0)
			System.out.println("찾으려는 책이 없습니다.");
		
		sc.close();
	}

}

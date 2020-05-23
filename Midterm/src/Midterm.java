import java.util.Scanner;

public class Midterm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int flag;
		int exit = 0;
		
		do  {
			System.out.println("============ 연락처 관리 ============");
			System.out.println("1. 번호 추가\n2. 번호 검색\n3. 정보 수정\n4. 번호 삭제\n5. 리스트 보기\n6. 종료");
			System.out.println("=================================");
			System.out.print("메뉴를 선택하세요: ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case(1):
				do {
					flag = 0;
					System.out.println("추가하고 싶은 번호를 입력하세요 (ex.010-1234-1234) : ");
					String num = sc.next();
					if (num.charAt(3) != '-' || num.charAt(8) != '-' || num.length() != 13 ) {
						flag = 1;
						System.out.println("형식을 맞춰주세요!");
					}
					
					if (flag == 0) {
						System.out.print("번호를 저장할 이름을 입력하세요 : ");
						String name = sc.next();
						new AddNum(num, name);
					}
				} while(flag == 1);
				continue;
			case(2):
				System.out.print("찾고자 하는 이름이나 번호(전부 또는 일부)를 입력해주세요: ");
				String input = sc.next();
				new FindInfo(input);
				continue;
			case(3):
				new PrintList();
				System.out.print("수정하고싶은 정보의 번호를 입력하세요 (취소는 -1입력): ");
				int id = sc.nextInt();
				if (id > 0) {
					new EditInfo(id);
				}
				continue;
			case(4):
				System.out.print("삭제하고 싶은 이름이나 전화번호(전부 또는 일부)를 입력하세요 : ");
				String info = sc.next();
				DelNum dn = new DelNum();
				dn.DelInfo(info);
				continue;
			case(5):
				new PrintList();
				continue;
			case(6):
				System.out.println("종료되었습니다.");
				exit = 1;
				break;
			default:
				System.out.println("잘못 누르셨습니다.");
				continue;
			}
		}while (exit == 0);
		
		sc.close();

	}

}

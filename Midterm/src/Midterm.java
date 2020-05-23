import java.util.Scanner;

public class Midterm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int flag;
		int exit = 0;
		
		do  {
			System.out.println("============ ����ó ���� ============");
			System.out.println("1. ��ȣ �߰�\n2. ��ȣ �˻�\n3. ���� ����\n4. ��ȣ ����\n5. ����Ʈ ����\n6. ����");
			System.out.println("=================================");
			System.out.print("�޴��� �����ϼ���: ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case(1):
				do {
					flag = 0;
					System.out.println("�߰��ϰ� ���� ��ȣ�� �Է��ϼ��� (ex.010-1234-1234) : ");
					String num = sc.next();
					if (num.charAt(3) != '-' || num.charAt(8) != '-' || num.length() != 13 ) {
						flag = 1;
						System.out.println("������ �����ּ���!");
					}
					
					if (flag == 0) {
						System.out.print("��ȣ�� ������ �̸��� �Է��ϼ��� : ");
						String name = sc.next();
						new AddNum(num, name);
					}
				} while(flag == 1);
				continue;
			case(2):
				System.out.print("ã���� �ϴ� �̸��̳� ��ȣ(���� �Ǵ� �Ϻ�)�� �Է����ּ���: ");
				String input = sc.next();
				new FindInfo(input);
				continue;
			case(3):
				new PrintList();
				System.out.print("�����ϰ���� ������ ��ȣ�� �Է��ϼ��� (��Ҵ� -1�Է�): ");
				int id = sc.nextInt();
				if (id > 0) {
					new EditInfo(id);
				}
				continue;
			case(4):
				System.out.print("�����ϰ� ���� �̸��̳� ��ȭ��ȣ(���� �Ǵ� �Ϻ�)�� �Է��ϼ��� : ");
				String info = sc.next();
				DelNum dn = new DelNum();
				dn.DelInfo(info);
				continue;
			case(5):
				new PrintList();
				continue;
			case(6):
				System.out.println("����Ǿ����ϴ�.");
				exit = 1;
				break;
			default:
				System.out.println("�߸� �����̽��ϴ�.");
				continue;
			}
		}while (exit == 0);
		
		sc.close();

	}

}

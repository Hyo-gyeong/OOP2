import java.util.Scanner;

public class EditInfo extends List{
	
	Scanner sc = new Scanner(System.in);
	int flag = 0;
	
	private String number;
	private String name;
	
	//Number
	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number; 
	}
	//Name
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name; 
	}
	
	EditInfo(int id) {
		for (int i = 0; i < List.count; i++) {
			if ((id-1) == i) {
				flag = 1;
				System.out.print("�̸��� �ٲٽðڽ��ϱ�?(y/n) ");
				String name_ans = sc.next();
				sc.nextLine();
				if (name_ans.equals("y")) {
					System.out.print("�ٲ� �̸���?: ");
					String new_name = sc.next();
					sc.nextLine();
					String old_name = name_list.get(i);
					name_list.set(i, new_name);
					System.out.println("�̸��� "+ old_name + "���� " + new_name + "(��)�� �ٲ�����ϴ�.");
				}				
				System.out.print("��ȣ�� �ٲٽðڽ��ϱ�?(y/n) ");
				String num_ans = sc.next();
				sc.nextLine();
				if (num_ans.equals("y")) {
					int num_flag;
					do {
						num_flag = 0;
						System.out.print("�ٲ� ��ȣ��?: ");
						String new_num = sc.next();
						sc.nextLine();
						if (new_num.charAt(3) != '-' || new_num.charAt(8) != '-' || new_num.length() != 13 ) {
							num_flag = 1;
							System.out.println("������ �����ּ���!");
						}
						
						if (num_flag == 0) {
							String old_num = number_list.get(i);
							number_list.set(i, new_num);
							System.out.println("��ȣ�� "+ old_num + "���� " + new_num + "(��)�� �ٲ�����ϴ�.\n");
						}
					}while(num_flag == 1);
				}
				break;
			}
		}
		if (flag == 0) 
			System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.\n");
	}
}

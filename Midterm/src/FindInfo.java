
public class FindInfo extends List{

	int flag = 0;
	
	FindInfo(String info) {
		System.out.println("#��ȣ          **�̸�**       **��ȭ��ȣ**");
		for (int i = 0; i < List.count; i++) {
			if (number_list.get(i).contains(info) || name_list.get(i).contains(info)) {
				System.out.printf("#%d %10s %20s\n", (i+1), name_list.get(i), number_list.get(i) );
				flag = 1;
			}
		}
		System.out.println();
		if (flag == 0)
			System.out.print("ã���ô� ������ �����ϴ�.\n");
	}
}

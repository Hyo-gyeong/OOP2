
public class PrintList extends List{

	PrintList() {
		System.out.println("#��ȣ            **�̸�**       **��ȭ��ȣ**");
		for (int i = 0; i < count; i++) {
			System.out.printf("#%d %11s %20s\n", (i+1), name_list.get(i), number_list.get(i) );
		}
	}
}

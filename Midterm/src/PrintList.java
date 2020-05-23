
public class PrintList extends List{

	PrintList() {
		System.out.println("#번호            **이름**       **전화번호**");
		for (int i = 0; i < count; i++) {
			System.out.printf("#%d %11s %20s\n", (i+1), name_list.get(i), number_list.get(i) );
		}
	}
}

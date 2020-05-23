
public class DelNum extends List{

	private String number;
	private String name;
	int flag = 0;
	
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
	
	public void DelInfo(String info){
		for (int i = 0; i < List.count; i++) {
			if (number_list.get(i).contains(info) || name_list.get(i).contains(info)) {
				number_list.remove(i);
				name_list.remove(i);
				List.count--;
				System.out.println("삭제되었습니다.\n");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("삭제할 정보가 없습니다.");
	}
}

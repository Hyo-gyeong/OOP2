public class AddNum extends List{
	
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
	
	AddNum(String number, String name){
		setNumber(number);
		setName(name);
		number_list.add(count, number);
		name_list.add(count, name);
		if (this.CheckNum(number) == 0 && this.CheckName(name) == 0) {
			System.out.println("이름 : " + getName() +" 번호 : " + getNumber() + "(으)로 저장되었습니다.\n");
			count++;
		}
		else if (this.CheckNum(number) == 0 && this.CheckName(name) == 1)
			System.out.println("이미 있는 이름입니다.");
		else if (this.CheckNum(number) == 1 && this.CheckName(name) == 0)
			System.out.println("이미 있는 번호입니다.");
		else
			System.out.println("이미 있는 정보입니다.");
	}
	
	public int CheckNum(String number){
		for (int i = 0; i < List.count; i++) {
			if (number.equals(number_list.get(i)))
				return 1;
		}
		return 0;
	}
	
	public int CheckName(String name){
		for (int i = 0; i < List.count; i++) {
			if (name.equals(name_list.get(i)))
				return 1;
		}
		return 0;
	}
}

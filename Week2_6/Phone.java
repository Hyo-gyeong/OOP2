class Phone {
	 private String name;
	 private String tel;
	 
	 public Phone(String n, String t) {
		 setName(n);
		 setTel(t);
	 }
	 
	 public void setName(String n) {
		 this.name = n;
	 }
	 public String getName() {
		 return this.name;
	 }
	 public void setTel(String t) {
		 this.tel = t;
	 }
	 public String getTel() {
		 return this.tel;
	 }
} 
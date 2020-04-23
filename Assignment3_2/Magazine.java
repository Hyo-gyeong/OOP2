
public class Magazine extends Book{

	private String release;
	
	public Magazine() {
		release = "0000.00.00";
	}
	
	public void setRelease(String r) {
		this.release = r; 
	}
	public String getRelease() {
		return release;
	}
	
	public String toString() {
		return "책 이름 : " + getTitle() + "\n페이지 수 : " + getPage() + 
				"\n저자 : " + getAuthor() + "\n발매일 : " + getRelease();
	}
}

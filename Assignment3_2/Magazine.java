
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
		return "å �̸� : " + getTitle() + "\n������ �� : " + getPage() + 
				"\n���� : " + getAuthor() + "\n�߸��� : " + getRelease();
	}
}

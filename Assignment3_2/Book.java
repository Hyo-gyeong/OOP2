
public class Book {

	private String title;
	private int page;
	private String author;
	
	public Book() {
		title = "제목 없음";
		page = 0;
		author = "저자 없음";
	}
	
	public void setTitle(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}
	
	public void setPage(int p) {
		page = p;
	}
	public int getPage() {
		return page;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	public String getAuthor() {
		return author;
	}
}

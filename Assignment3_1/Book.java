
public class Book {
	private String author;
	private String title;
	
	public Book(String a, String t) {
		setAuthor(a);
		setTitle(t);
	}

	public void setAuthor(String a) {
		author = a;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setTitle(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return "제목 : " + title + "   저자 : " + author + "\n";
	}
}

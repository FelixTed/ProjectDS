package finalProjectDS;

public class Textbook {
	//class data fields
	private String title;
	private String author;
	
	//default constructor
	public Textbook() {
		
	}
	
	//constructors taking all data fields
	public Textbook(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//returns title as a String
	public String getTitle() {
		return this.title;
	}
	
	//returns author as a String
	public String getAuthor() {
		return this.author;
	}
	
	//sets title to desired String
	public void setTitle(String title) {
		this.title = title;
	}
	
	//sets author to desired String
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//returns class information as a string
	public String toString() {
		return "Book title: " + this.title + " Author: " + this.author;
	}
}

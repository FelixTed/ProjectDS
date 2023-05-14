package finalProjectDS;

public class Course {
	//class data fields
	private String courseName;
	private Instructor instructor;
	private Textbook textbook;
	
	//default constructor
	public Course() {
		
	}
	
	//constructor taking all data fields
	public Course(String courseName, Instructor instructor, Textbook textbook) {
		this.instructor=new Instructor(instructor.getOfficeNumber(),instructor.getName(),instructor.getFamilyName());
		this.courseName = courseName;
		this.textbook = new Textbook(textbook.getTitle(),textbook.getAuthor());
	}
	
	//returns courseName as a String
	public String getCourseName() {
		return this.courseName;
	}
	
	//returns instructor as an Instructor
	public Instructor getInstructor() {
		return this.instructor;
	}
	
	//returns textBook as a Textbook
	public Textbook getTextBook() {
		return this.textbook;
	}
	
	//sets courseName to desired String
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	//sets instructor to desired Instructor
	public void setInstructor(Instructor instructor) {
		this.instructor.setFamilyName(instructor.getFamilyName());
		this.instructor.setName(instructor.getName());
		this.instructor.setOfficeNumber(instructor.getOfficeNumber());
	}
	
	//sets textbook to desired Textbook
	public void setTextBook(Textbook textbook) {
		this.textbook.setAuthor(textbook.getAuthor());
		this.textbook.setTitle(textbook.getTitle());
	}
	
	//returns all class information as a string
	public String toString() {
		return "Name of the course: " + this.courseName + " " + 
				this.instructor.toString() + " " + this.textbook.toString();
	}
}

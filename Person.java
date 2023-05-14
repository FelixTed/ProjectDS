package finalProjectDS;

public abstract class Person {
	//data fields of abstract class
	private String name;
	private String familyName;
	
	//default constructor
	public Person() {
		
	}
	
	//constructor taking all data fields
	public Person(String name, String familyName) {
		this.name = name;
		this.familyName = familyName;
	}
	
	//returns name of instructor as String
	public String getName() {
		return this.name;
	}
	
	//returns family name of instructor as String
	public String getFamilyName() {
		return this.familyName;
	}
	
	//sets name to desired String
	public void setName(String name) {
		this.name = name;
	}
	
	//sets family name to desired String
	public void setFamilyName(String name) {
		this.familyName = familyName;
	}
}

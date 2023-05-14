package finalProjectDS;

import java.util.LinkedList;

import java.util.Scanner;
import java.io.*;

public class CourseRegistrationInfo {
	
	//method to take .txt file with course info and store it in LinkedList of Course class
	public static void readList(String fileName, LinkedList<Course> list) throws IOException{
		//opening file and Scanner to read this file
		File file = new File(fileName);
		Scanner input = new Scanner(file);
		
		//Looping in the file to assign correct values to a new Course object in the LinkedList
		while(input.hasNext()) {
			//We go line per line and separate the first line to get all the different string we want
			String courseName = input.next();
			String name = input.next();
			String familyName = input.next();
			String officeNumber = input.nextLine();
			String title = input.nextLine();
			String author = input.nextLine();
			Instructor instructor = new Instructor(officeNumber, name, familyName);
			Textbook textBook = new Textbook(title, author);
			list.add(new Course(courseName,instructor,textBook));
		}
		
		input.close();
	}
}

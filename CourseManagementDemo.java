package finalProjectDS;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.io.*;

public class CourseManagementDemo {

	public static void main(String[] args) {
		//Creating linked list and storing file name to a String
		LinkedList<Course> courseList = new LinkedList<>();
		String fileName = "coursedata.txt";
		
		//Using the method to read the file into a linked list of Student objects and handling IO exception
		try {
			CourseRegistrationInfo.readList(fileName, courseList);
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		
		//sorting courseList by course name by using the default comparator of strings on getCourseName
		Collections.sort(courseList, new CourseComparator());
		
		//Printing whole list of course by course names to check
		Iterator<Course> c = courseList.iterator();
		while(c.hasNext()) {
			System.out.println(c.next().toString());
		}
	}
	
}

//Comparator class to compare course objects
class CourseComparator implements Comparator<Course>{

	//using String methods to compare Courses by course name, ignoring upper case letters
	public int compare(Course o1, Course o2) {
		return o1.getCourseName().compareToIgnoreCase(o2.getCourseName());
	}

}

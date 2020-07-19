package OOP;

import java.util.ArrayList;
public class GenericArray {
	public static void main(String[] args) {
		Student s = new Student("Zubaer", 60, 1002);
		School.mySchool(s);
		//----Generic---------
		ArrayForDisplay.myArray();
	} 
}
//===========================================
class Student{
	String name;
	int age;
	int rollno;
	public Student(String name, int age, int rollno) {
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}	
}
//--------------------------------------------
class School{
	public static void mySchool(Student s) {
		ArrayList<Student> list = new ArrayList<Student>();	
		list.add(s);
		for(Student st : list) {
			System.out.printf("%s -> %s -> %s%n", st.name, st.age, st.rollno);
		}
 	}
}
//OUTPUT   Zubaer -> 60 -> 1002
//------Generic-------------------------------
class Display{
	public static <T> void genericDisplay(T[] dis) { 
		for(T element : dis) {
			System.out.printf("%s ", element);
		}
		System.out.println();
}	
}
class ArrayForDisplay{
	public static void myArray() {
		Integer[] intArr = {2, 5, 66, 89};
		Display.genericDisplay(intArr);
	}
}
// OUTPUT 2 5 66 89 
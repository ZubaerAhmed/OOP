package OOP;
import java.util.ArrayList;
import java.util.List;
public class GenericBoxClass {
	public static void main(String[] args) {	
		Team t = new Team("Abahoni", 30);
		Team q = new Team("Zubaer", 60);
		Team.printList();
		
		Bucky.bucky();
	}
}
//-------------------------------------------------------
class Player{
	private String name;
	public Player(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
//-------------------------------------------
class Team{
	private String name;
	private int age;
	private static List members = new ArrayList();
	
	public Team(String name, int age) {
		this.name = name;
		this.age = age;
		members.add(name);
		members.add(age);
	}
	public static void printList() {
		int count = 0;
		for(Object li : members) { 
			System.out.print(li + ", ");
			count++;
			if(count == 2) {
				System.out.println();
				count = 0;
			}
		}
	}
}
//--------------Bucky-----------------------------------------
class Bucky{
	public static void bucky() {
		Integer[] intArray = {1, 2, 4, 6};	
		Character[] charArray = {'a', 'c', 'e', 'g'};
		
		printArray(intArray);
		printArray(charArray);
		System.out.println("Max is: " + max(23, 45, 13));
		System.out.println(max("zubaer", "Novaira", "Fahim"));
		GenericType.print();
}
	public static <T> void printArray(T[] arr) {
		for(T  i : arr) {
			System.out.printf("%s ", i);
		}
		System.out.println();
	}
	//-------max with generic-----------
	// This is return type T
	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T m = a;
		if(b.compareTo(a) > 0) {
			m = b;
		}else if(c.compareTo(m) > 0){
			m = c;
		}
		return m;
	}
}	
//-------------------------------------------------------
class Box<T>{
	private T t;
	public Box(T t) {
		this.t = t;
	}
	public T get_t() {
		return t;
	}
}
class GenericType{
	public static void print() {
	Box<Integer> a = new Box<Integer>(12);
	Box<String> b = new Box<String>("Zubaer");
	System.out.println(a.get_t() +" -> "+ b.get_t());
	}
}
/*
Abahoni, 30, 
Zubaer, 60, 
1 2 4 6 
a c e g 
Max is: 45
zubaer
12 -> Zubaer
*/	



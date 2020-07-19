package OOP;

import java.util.ArrayList;
import java.util.List;

public class GenericNovairaHelped {
	public static void main(String[] args) {
		Box b = new Box(20);
		Box b2 = new Box(40);

		if(b.isEqual(b2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
		//==================================
		BoxName3 box = new BoxName3();
		BoxName bo = new BoxName("ZUB_NOVU", 60);		
		BoxName3.print3(bo);
	}
static class Box{
	int width;
	public Box(int width) {
		this.width = width;
	}
	public boolean isEqual(Box b) {
		if(this.width == b.width) {
			return true;
		}else {
			return false;
		}
	}
}
}
//===================================================
class BoxName{
	private String name;
	int age;
	public BoxName(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
//----------------------------------------------------
class BoxName2 {
	public static void print2() {
	BoxName a = new BoxName("Zubaer", 60);
	BoxName b = new BoxName("Novaira", 24);
	List<BoxName> list = new ArrayList<BoxName>();
	list.add(a);
	list.add(b);
	}	
}
//--------------------------------------------------
class BoxName3 {
	public static void print3(BoxName b) { 
		System.out.println(b.getName()+ " Age is: "+ b.getAge());
	}	
}
/*
Not equal
ZUB_NOVU Age is: 60
*/
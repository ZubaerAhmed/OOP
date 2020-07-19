package OOP;

public class InheritanceAnimal {

	public static void main(String[] args) {
		

	}
}
//======================================
class Animal{
	private int eyes;
	public Animal(int eyes) {
		this.eyes = eyes;
	}
	
}
//======================================
class Dog{
	private int legs;

	protected Dog(int legs) {
		super();
		this.legs = legs;
	}
	private void chew() {
		System.out.println("Dog.chew()");
	}


	
	
}
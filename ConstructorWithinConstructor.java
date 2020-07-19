package OOP;

public class ConstructorWithinConstructor {

	public static void main(String[] args) {
		
		Account acc = new Account();
		//acc.setName("Novaira");
		System.out.println("-> "+ acc.getName() );
	}
}
//==========================================
class Account{
	private String name;
	
	public Account() {
		this("Calling Default name ZUBAER");
	}
	public Account(String name) {
		this.name = name;
		System.out.println("Name is: " + name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
/*
Name is: Calling Default name ZUBAER
-> Calling Default name ZUBAER

*/
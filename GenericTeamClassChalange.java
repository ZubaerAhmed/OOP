package OOP;

import java.util.ArrayList;
import java.util.List;

public class GenericTeamClassChalange {

	public static void main(String[] args) {
		NameOfPlayerChalange p = new NameOfPlayerChalange("Zuaber");
		NameOfPlayerChalange q = new NameOfPlayerChalange("Novaira");
		NameOfPlayerChalange r = new NameOfPlayerChalange("Fahim");
		
		NameOfTeamChalange t = new NameOfTeamChalange("Abahoni");
		//NameOfTeamChalange<NameOfPlayerChalange> t = new NameOfTeamChalange<>("Abahoni");
		t.addPlayer(p);
		t.addPlayer(q);
		t.addPlayer(r);
		t.printList();
	} 
}
//=======================================================================
class Legue<T>{
	public String name;
	private List<T> league = new ArrayList<>();
	public Legue(String name) {
		this.name = name;
	}
	public void addName(T team) {
		league.add(team); 
	}
}
//-----------------------------------------------------------------------
class NameOfPlayerChalange{ 
	private String name;
	public NameOfPlayerChalange(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
class NameOfTeamChalange{ 
	private String name;
	private static List<NameOfPlayerChalange> list = new ArrayList<>();
	public NameOfTeamChalange(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void addPlayer(NameOfPlayerChalange player) {
		list.add(player);
	}
	public static void printList() {
		int count = 0;
		for(Object li : list) { 
			System.out.print(li + ", ");
			count++;
			if(count == 2) {
				System.out.println();
				count = 0;
			}
		}
	}
}
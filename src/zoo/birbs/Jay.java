package zoo.birbs;

import zoo.interfaces.Adorable;
import zoo.interfaces.Flyable;

public class Jay extends Bird implements Flyable, Adorable {

	
	@Override
	public void fly() {
		System.out.println("#flaps happily");
	}

	@Override
	public String awwwww() {
		return "BlueJay is an abomination";
		
	}
}

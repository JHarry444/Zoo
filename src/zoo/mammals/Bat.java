package zoo.mammals;

import zoo.interfaces.Adorable;
import zoo.interfaces.Flyable;

public class Bat extends Mammal implements Flyable, Adorable {

	@Override
	public void move() {
		System.out.println("How do bats move? Do they mince?");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("#flaps spookily#");
	}

	@Override
	public String awwwww() {
		return "Batfink is adorable";
	}

}

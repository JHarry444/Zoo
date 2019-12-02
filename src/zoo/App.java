package zoo;

import java.util.ArrayList;
import java.util.List;

import zoo.mammals.Animal;
import zoo.mammals.Dog;
import zoo.mammals.Tiger;

public class App {

	public static void main(String[] args) {
//		List<Flyable> flyingAnimals = new ArrayList<>();
//		flyingAnimals.add(new Bat());
//		flyingAnimals.add(new Jay());
//		for (Flyable f : flyingAnimals) {
//			f.fly();
//		}
		Dog animal1 = new Dog();
		Animal animal2 = new Tiger();
		List<Animal> zoo = new ArrayList<>();
		zoo.add(animal1);
		zoo.add(animal2);
		for (Animal a : zoo) {
			if (a instanceof Dog) {
				((Dog) a).fetch();
			}
			a.move();
		}
		
	}

}







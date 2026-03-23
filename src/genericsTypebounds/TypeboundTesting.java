package genericsTypebounds;

public class TypeboundTesting {

	public static void main(String[] args) {
		
		// Aufgabe 1: SortableBox
		SortableBox<String> sb1 = new SortableBox<String>("Affe");
		SortableBox<String> sb2 = new SortableBox<String>("David");
		SortableBox<Integer> sb3 = new SortableBox<Integer>(21);
		SortableBox<Integer> sb4 = new SortableBox<Integer>(69);
		
		
		System.out.println(sb1.compareToOtherBox(sb2));
		System.out.println(sb3.compareToOtherBox(sb4) + "\n");
		
		// Aufgabe 2: ShapeBox
		Circle c1 = new Circle("Rot");
		Rectangle r1 = new Rectangle ("Blau");
		
		r1.draw();
		c1.draw();
		
		System.out.println(); //Zeilenumbruch
		//Aufgabe 3: AnimalCage
		
		Cat a1 = new Cat("David");
		Dog d1 = new Dog("Nevio");
		
		AnimalCage<Cat> catCage = new AnimalCage<>(a1);
		catCage.AnimalSound();
		
		AnimalCage<Dog> dogCage = new AnimalCage<>(d1);
		dogCage.AnimalSound();
		
		System.out.println(); //Zeilenumbruch
		// Aufgabe 4: ListBox
		
		ListBox<Double> doubleBox = new ListBox<>();
		doubleBox.add(10.0);
		doubleBox.add(13.2);
		doubleBox.add(1.5);
		
		System.out.println(doubleBox.sumElements());
		ListBox<Integer> intBox = new ListBox<>();
		intBox.add(4);
		intBox.add(3);
		intBox.add(9);
		
		System.out.println(intBox.sumElements());	
	}
}

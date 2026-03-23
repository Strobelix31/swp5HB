package genericsTypebounds;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Der Hund namens " + this.getName() + " macht Wuff!");
		
	}

	
}

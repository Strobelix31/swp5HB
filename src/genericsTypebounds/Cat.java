package genericsTypebounds;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Die Katze namens " + this.getName() + " macht Miau!");
	}

}

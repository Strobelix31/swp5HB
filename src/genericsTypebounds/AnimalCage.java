package genericsTypebounds;

public class AnimalCage<T extends Animal> {

	private T animal;

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}

	public AnimalCage(T animal) {
		super();
		this.animal = animal;
	}
	
	public void AnimalSound() {
		this.animal.makeSound();
	}
}

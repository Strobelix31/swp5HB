package genericsTypebounds;

public class Circle extends Shape {

	public Circle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("Ein Kreis der " + this.getColor() + " ist.");
	}

}

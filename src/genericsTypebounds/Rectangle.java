package genericsTypebounds;

public class Rectangle extends Shape {

	public Rectangle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("Ein Rechteck das " + this.getColor() + " ist.");
		
	}

}

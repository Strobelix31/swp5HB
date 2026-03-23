package generics;

public class BoxTest {

	public static void main(String[] args) {
		
		Box<Integer> b1 = new Box<>(10);
		Box<String> b2 = new Box<>("Kutayyyy");
		Box<Double> b3 = new Box<>(10.33);
		System.out.println(b1.getValue() + "\n" + b2.getValue() + "\n" + b3.getValue());

	}

}

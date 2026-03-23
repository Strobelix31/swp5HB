package wildcards;

public class Box<T extends Comparable<T>> {
	
	private T text;

	public Box(T text) {
		super();
		this.text = text;
	}
	
	public T getText() {
		return text;
	}
	
	public void setText(T text) {
		this.text = text;
	}

	public static boolean compareBoxes(Box<?> b1, Box<?> b2) {
		return b1.getText().equals(b2.getText());
	}

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>("Moinsen");
		Box<String> box2 = new Box<>("Servas");
		
		System.out.println(Box.compareBoxes(box1, box2));
		
		
	}
	
	
}

package wildcards;

public class PairBox<T extends Comparable<? super T>, U> {

	private T value1;
	private U value2;
	
	public T getValue1() {
		return value1;
	}
	public void setValue1(T value1) {
		this.value1 = value1;
	}
	public U getValue2() {
		return value2;
	}
	public void setValue2(U value2) {
		this.value2 = value2;
	}
	
	public PairBox(T value1, U value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public int compareFirst(PairBox<T, ?> o) {
		return this.value1.compareTo(o.getValue1());
	}
	
	public static void main(String[] args) {
		PairBox<String, Integer> pb1 = new PairBox<>("Hallo", 42);		// Vergleicht Alphabetisch Länge zwischen 2 Buchstaben
		PairBox<String, Integer> pb2 = new PairBox<>("Hampelmann", 40);
		
		int result = pb1.compareFirst(pb2);
		System.out.println(result); 
		
		PairBox<Integer, String> pb3 = new PairBox<>(45, "Luca");	// Vergleicht Nummerisch (1. Zahl größer = 1; 2. Zahl größer = -1; gleich groß = 0)
		PairBox<Integer, String> pb4 = new PairBox<>(42, "Lyon");
		
		int result2 = pb3.compareFirst(pb4);
		System.out.println(result2); 
		
	}
	
}

package generics;

public class TripleTest {

	public static void main(String[] args) {
		
		Triple<Integer, String, Double> t1 = new Triple<>(67, "NeunUndSechzig", 69.69);
		System.out.println(t1.toString());
	}
}

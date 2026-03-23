package generics;

public class PairTest {

	public static void main(String[] args) {
		
		Integer i1 = 99;
		Integer i2 = 67;
		
		Pair iPair = new Pair(i1, i2);

		Double d1 = 98.1;
		Double d2 = 76.2;
		
		Pair dPair = new Pair(d1, d2);
		
		Car c1 = new Car("Audi RS6", 300);
		Car c2 = new Car("Lamboo", 700);
		
		Pair cPair = new Pair(c1, c2);
		System.out.println(cPair.getFirst());
		
		Car c3 = (Car) cPair.getSecond(); // Cast hinzufügen, damit Object auf Car zugreifen kann.
		System.out.println(c3);
		
		Pair icPair = new Pair(i1, c2);
	}
}

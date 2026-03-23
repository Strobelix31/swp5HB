package generics;

public class PaarTesting {

	public static void main(String[] args) {
		
		// Ausgabe
			Paar<String, Integer> SI = new Paar<String, Integer>("Eins", 1);
			System.out.println("First: " + SI.getFirst() + " | " + "Second: " + SI.getSecond());
							
		// Ausgabe mit SWAP
			Paar<Integer, String> swapped = SI.swap();
			System.out.println("\nSWAP: " + "\n" + "First: " + swapped.getFirst() + " | " + "Second: " + swapped.getSecond());
	}
}

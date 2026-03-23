package genericMethods;

public class CountElements {

	
	public static <T extends Comparable <T>> int countGreaterThan(T[] array, T element) {
		int count = 0;
		
		for(T item : array) {
			if(item.compareTo(element) > 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] Args) {
		Integer[] numbers = {1, 3, 5, 7, 9};
        System.out.println(countGreaterThan(numbers, 4)); // Ausgabe: 3

        String[] words = {"Apfel", "Banane", "Zitrone"};
        System.out.println(countGreaterThan(words, "Avocado")); // Ausgabe: 2
	}
}
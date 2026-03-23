package genericMethods;

import java.util.Arrays;
import java.util.List;

public class printList {

	
	public static void printL(List<?> list) {
		for(Object e : list) {
			System.out.println(e + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] Args) {
		List<String> stringList = Arrays.asList("One", "Two", "Three");
        List<Integer> intList = Arrays.asList(1, 2, 3);

        printL(stringList); // Ausgabe: One Two Three
        printL(intList);    // Ausgabe: 1 2 3
	}
}


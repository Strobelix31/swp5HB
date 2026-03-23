package genericMethods;

import java.util.Arrays;

public class ReversedArray{
	
	public static <T> T[] reverseArray(T[] array) {
		int left = 0;
        int right = array.length - 1;

        while (left < right) {		// Die Schleife läuft, solange sich die beiden Zeiger nicht treffen.
        							// Das heißt, solange noch Elemente zum Vertauschen übrig sind.
            T temp = array[left];	// Das linke Element wird in einer Hilfsvariable temp gespeichert.
            array[left] = array[right];		// Das rechte Element wird nach links kopiert.
            array[right] = temp;	// Das gespeicherte linke Element wird nach rechts geschrieben.

            left++;	// left geht nach rechts (nächstes Element von vorn)
            right--;	// right geht nach links (nächstes Element von hinten)
        }

        return array;
    }
	
	
	
	
	
	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4};
        String[] stringArray = {"A", "B", "C"};

        System.out.println(Arrays.toString(reverseArray(intArray)));   // Ausgabe: [4, 3, 2, 1]
        System.out.println(Arrays.toString(reverseArray(stringArray))); // Ausgabe: [C, B, A]	
	}
	
}

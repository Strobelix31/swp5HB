package innereKlassen.anonym;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymComparator {

	public static void main(String[] args) {
		String[] words = {"Java", "Programming", "HTL", "Code"};
			
			//Sortieren mit anonymer Klasse
			Arrays.sort(words, new Comparator<String>() {			// 1) Array zu Sortieren
																	// 2) Vergleichsmethode
																	// Comparator: Interface
				public int compare(String s1, String s2) {			
					return Integer.compare(s1.length(), s2.length());
											// anonyme Klasse implementiert Interface + erstellt automatisch das Objekt
				}
			});
			
		// Ausgabe des Arrays
			System.out.println(Arrays.toString(words));
	}
}

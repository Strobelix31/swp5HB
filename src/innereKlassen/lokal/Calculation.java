package innereKlassen.lokal;

public class Calculation {
	
	 // Methode zur Berechnung des Durchschnitts eines double-Arrays
    public static double calculateAverage(double[] numbers) {
        class AvarageCalculator { // Lokale Klasse, die nur innerhalb dieser Methode existiert
            public double calculate() {	// Methode zur Durchführung der eigentlichen Berechnung
                double sum = 0.0; // Summe aller Zahlen

                // Schleife durch das gesamte Array
                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i]; // Zahl zu Summe hinzufügen
                }

                return sum / numbers.length; // Durchschnitt berechnen und zurückgeben
            }
        }

        // Objekt der lokalen Klasse erstellen und Berechnung starten
        return new AvarageCalculator().calculate();
    }

    public static void main(String[] args) {
        double[] numbers = {2.0, 4.0, 6.0, 8.0}; // Beispiel-Array

        double avg = calculateAverage(numbers); // Durchschnitt berechnen

        System.out.println(avg); // Ergebnis auf der Konsole ausgeben
    }
}
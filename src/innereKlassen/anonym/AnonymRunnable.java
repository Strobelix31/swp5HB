package innereKlassen.anonym;

public class AnonymRunnable {
	
	public AnonymRunnable() {
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 1; i <= 5; i++) {		// Schleife, die die Zahlen 1 bis 5 ausgibt
					System.out.println(i);
				}
			}
		};
		
		Thread t = new Thread(r);	// Erstellen eines neuen Threads und Übergabe des Runnable-Objekts.
		t.start();	 // Startet den Thread. Dadurch wird die run()-Methode parallel ausgeführt.
	}
	// Was macht der Thread:
	//  -> Der Thread führt im Hintergrund die run()-Methode aus, unabhängig vom restlichen Programm.
	//  -> In diesem Fall gibt er die Zahlen 1 bis 5 aus.
	
	public static void main(String[] args) {
		new AnonymRunnable();	// Konstruktor wird aufgerufen, dadurch startet auch der Thread
	}
	
}

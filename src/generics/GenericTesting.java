package generics;


public class GenericTesting {

	public static void main(String[] args) {
		
		//Klassische Lösung
		Library l1 = new Library();
		l1.addMedia(new Book("David Goliath"));
		l1.addMedia(new Video("DSDS: Bewerbung von Nevio Hopfgartner"));
		l1.addMedia(new Zeitung("Playboy: Lyon Strasser zeigt sich in seiner neuen Umgebung"));
		
		// Library für Book erstellen
		GenericLibrary<Book> BookLibrary = new GenericLibrary<>();
		BookLibrary.addMedia(new Book("David Goliath"));
		System.out.println("Buch:\n" + BookLibrary.retrieveLast().getTitle());
		
		//Library für Video erstellen
		GenericLibrary<Video> VideoLibrary = new GenericLibrary<>();
		VideoLibrary.addMedia(new Video("DSDS: Bewerbung von Nevio Hopfgartner"));
		System.out.println("\nVideo:\n" + VideoLibrary.retrieveLast().getTitle());
		
		//library für Zeitung erstellen
		GenericLibrary<Zeitung> NewspaperLibrary = new GenericLibrary<>();
		NewspaperLibrary.addMedia(new Zeitung("Playboy: Lyon Strasser zeigt sich in seiner neuen Umgebung"));
		System.out.println("\nZeitung:\n" + NewspaperLibrary.retrieveLast().getTitle());
	}
}

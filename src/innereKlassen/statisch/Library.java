package innereKlassen.statisch;

public class Library {

	static String name = "Standartbibliothek";
	
	public static class Book{
		public void showLibrary() {
			System.out.println("Bibliothek: " + name);
		}
	}	
	
	public static void main(String[] args) {
		Book b = new Library.Book();
		b.showLibrary();
	}
}

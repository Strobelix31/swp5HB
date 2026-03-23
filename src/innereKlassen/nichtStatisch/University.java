package innereKlassen.nichtStatisch;

public class University {
	
	public class Student{
		public void showData(String name, int id) {
			System.out.println("Name: " + name);
			System.out.println("Nummer: " + id);
		}
	}
	
	public static void main(String[] args) {
		University u = new University();
		University.Student s1 = u.new Student();
		s1.showData("Kutay", 67);

	}

}

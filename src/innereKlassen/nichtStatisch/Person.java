package innereKlassen.nichtStatisch;

public class Person {

	private String name;
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public class Details{
		public void showName() {
			System.out.println(Person.this.name);
		}
	}
	
	public static void main(String[] args) {
		Person p = new Person("Kutaaay");
		Details d = p.new Details();
		d.showName();
	}
}

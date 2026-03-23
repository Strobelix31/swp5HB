package innereKlassen.statisch;

public class Calculator {

	static class Addition{
		int add(int a, int b) {
			return a + b;
		}
	}
	
	
	public static void main(String[] args) {
		
		Addition m = new Calculator.Addition();
		m.add(5, 5);
		

	}

}

package innereKlassen.statisch;

public class Mathematics {

	public static class Fakultät{
		public int berechne(int n) {
			int result = 1;
			
			for(int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		}	
	}
	
	public static void main(String[] args) {
	
		Fakultät f = new Mathematics.Fakultät();
		System.out.println(f.berechne(5));
		
	}
}

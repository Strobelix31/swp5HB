package genericMethods;

public class FindMinimum {

	public static <T extends Comparable <T>> T findMin(T a, T b) {
		if(a.compareTo(b) <= 0) {
			return a;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(findMin(15, 10));
		System.out.println(findMin("Dog", "Cat"));
	}
			
}

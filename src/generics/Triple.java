package generics;

public class Triple<T,U,V> {

	private T first;
	private U second;
	private V third;
	
	public Triple(T first, U second, V third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public U getSecond() {
		return second;
	}

	public void setSecond(U second) {
		this.second = second;
	}

	public V getThird() {
		return third;
	}

	public void setThird(V third) {
		this.third = third;
	}
	
	public String toString() {
		return "Triple: \nFirst: " + first + " | Second: " + second + " | Third: " + third;
	}
}

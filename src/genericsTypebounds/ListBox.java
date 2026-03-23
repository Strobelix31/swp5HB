package genericsTypebounds;

import java.util.ArrayList;
import java.util.List;

public class ListBox<T extends Number> {

	private List<T> list;

	public ListBox() {
		this.list = new ArrayList<T>();
	}
	
	public void add(T t) {
		this.list.add(t);
	}
	
	public double sumElements() {
		double sum = 0;
		for(T t : this.list) {
			sum += t.doubleValue();
		}
		return sum; 
	}
}

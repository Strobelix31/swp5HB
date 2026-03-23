package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Container<T> {

	List<T> containerList;

	public List<T> getContainerList() {
		return containerList;
	}

	public void setContainerList(List<T> containerList) {
		this.containerList = containerList;
	}

	public Container() {
		this.containerList = new ArrayList<>();
	}
	
	public void add(T content) {
		this.containerList.add(content);
	}
	
	public static double sumItems(Container<? extends Number> c) {
		double sum = 0;
		for(Number item : c.getContainerList()) {				// number höchster typ deshalb verwendet
			sum += item.doubleValue();
		}
		return sum;
	}
	
	
	public static void main (String[] args) {
	
		
		Container<Integer> c1 = new Container<>();
		c1.add(10);
		c1.add(1);
		c1.add(2);
		
		System.out.println(Container.sumItems(c1));
		
	}
}

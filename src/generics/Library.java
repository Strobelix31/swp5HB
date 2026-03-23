package generics;

import java.util.ArrayList;

public class Library {

	private ArrayList<Object> media = new ArrayList<Object>();
	
	public void addMedia(Object m) {
		media.add(m);
	}
	
	public Object retrieveLast() {
		if(media.isEmpty()) 
			return null;
		return media.remove(media.size() - 1);
	}
}



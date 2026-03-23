package generics;

import java.util.ArrayList;

public class GenericLibrary <T>{
	
	private ArrayList<T> list = new ArrayList<>();
	
	
	// Media hinzufügen (Buch, Video, ...)
	public void addMedia(T media) {
		list.add(media);
	}
	
	
	public T retrieveLast() {
		if(list.isEmpty()) 
			return null;
		return list.remove(list.size() - 1);
	}
}

package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Handler<T> {

	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Handler(T value) {
		super();		this.value = value;
	}	
	public void addItems(List<? super T> list) {
			list.add(value);
	}
	
	public static void main(String[] args) {
		
		Handler<Integer> h = new Handler<>(42);

        List<Number> nl = new ArrayList<>();
        h.addItems(nl); // funktioniert, da Number eine Oberklasse von Integer ist

        System.out.println(nl); // Ausgabe: [42]
	}
}

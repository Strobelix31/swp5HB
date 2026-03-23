package lambdaAusdrücke;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

import javax.swing.JButton;

public class LambdaExpressionExamples {
	
	public static void main(String[] args) {
	
	// 1) 
		Runnable runnable = () -> {
			System.out.println("Zahlen von 1 bis 10:");
			for(int i = 1; i <= 10; i++) {
				System.out.println("Zahl: " + i);
			}
		};
		
		
		Thread t = new Thread(runnable);
		t.start();
		

	// 2)
		Supplier<Integer> supplier = () -> {
			System.out.println("Zufallszahl zwischen 1 und 100: ");
			return (int) Math.random() * 100;
			};
			
		System.out.println(supplier.get());
		
	// 3)
		Consumer<String> consumer = (String abc) -> {System.out.println(abc.toUpperCase());
		};
	
		consumer.accept("Hallo");
		
	// 4)
		ArrayList<String> al = new ArrayList<String>();
		al.add("HTL");
		al.add("Reutte");
		
		Comparator<String> comparator = (s1, s2) -> {return Integer.compare(s1.length(), s2.length());};
		System.out.println(comparator.compare("HTL", "Reutte"));
		
	// 5)
		// Button erstellen
        JButton button = new JButton("Click me");

        // ActionListener mit Lambda-Ausdruck
        button.addActionListener(e -> System.out.println("Button clicked"));

        // Klick auf den Button simulieren
        button.doClick();		
	}
}

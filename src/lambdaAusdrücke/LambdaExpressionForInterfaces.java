package lambdaAusdrücke;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

import genericsTypebounds.Rectangle;

public class LambdaExpressionForInterfaces {

	Runnable runnable = () -> {System.out.println("runnable");};

	ActionListener listener = (ActionEvent e) -> {System.out.println("listener");};
	
	Supplier<String> supplier = () -> {return "h";};
	
	Consumer<Point> consumer = (Point t) -> {System.out.println("consumer");};
	
	Comparator<Rectangle> comparator = (Rectangle o1, Rectangle o2) -> {return 20;};
}

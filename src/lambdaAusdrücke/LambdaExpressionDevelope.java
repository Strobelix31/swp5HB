package lambdaAusdrücke;

import java.util.function.DoubleSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.UnaryOperator;

public class LambdaExpressionDevelope {

// a) 
	DoubleSupplier ds = () -> {return 42.0;};
	DoubleSupplier ds1 = () -> {return Math.random();};
// b)	
	LongToDoubleFunction lf = (l) -> {return 30.0;};
// c)	
	UnaryOperator<String> up = (s) -> {return "Hallo";};
	
	
}

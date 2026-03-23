package generics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PaarUnitTest {
	
	@Test
    void testSecondFromPair() {
        Paar<String, Integer> p1 = new Paar<>("Hallo", 42);
        Integer result = p1.getSecond();
        // Assert.assertEquals(result, 42);
    }
	
	@Test
    void testFirstFromPair() {
        Paar<String, Integer> p1 = new Paar<>("Hallo", 42);
        String result = p1.getFirst();
        Assert.assertEquals(result, 42);
    }
}

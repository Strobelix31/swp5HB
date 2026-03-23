package genericsTypebounds;

public class Transformer<T extends Number, R> {

    public R transform(T value) {
        return null;
    }

    public static void main(String[] args) {
        Transformer<Double, String> doubleToString = new Transformer<>() {
            @Override
            public String transform(Double value) {
                return "Der Wert ist: " + value;
            }
        };

        Transformer<Integer, Double> intToDouble = new Transformer<>() {
            @Override
            public Double transform(Integer value) {
                return value.doubleValue();
            }
        };

        System.out.println(doubleToString.transform(42.5));
        System.out.println(intToDouble.transform(7));
    }
}

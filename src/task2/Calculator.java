package task2;

public class Calculator{

    public static <T extends Number, K extends Number> Double sum(T t, K k) {
        return t.doubleValue() + k.doubleValue();
    }

    public static <T extends Number, K extends Number> double multiply(T t, K k) {
        return t.doubleValue() * k.doubleValue();
    }

    public static <T extends Number, K extends Number> double subtract (T t, K k) {
        return t.doubleValue() - k.doubleValue();
    }

    public static <T extends Number, K extends Number> double divide (T t, K k) {
        if (k.doubleValue() == 0) {
            throw new RuntimeException("Division by zero!");
        }
        return t.doubleValue() / k.doubleValue();
    }
}

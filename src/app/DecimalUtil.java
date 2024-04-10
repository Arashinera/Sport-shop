package app;

public class DecimalUtil {

    public static double rounderUtil(float number) {
        return Math.round(number * 100.0) / 100.0;
    }
}

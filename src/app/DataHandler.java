package app;
public class DataHandler {

    public static float priceHandler(String color, float price) {
        return switch (color) {
            case "red" -> price + 0.99f;
            case "blue" -> price - 0.99f;
            case "white" -> price + 0.55f;
            case "black" -> price - 0.25f;
            default -> price;
        };
    }
}

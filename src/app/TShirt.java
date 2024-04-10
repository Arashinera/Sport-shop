package app;

public class TShirt extends ActiveSports {

    float price = 10.99f;

    public enum Color {
        RED, BLUE
    }

    private final Color color;
    public TShirt(Color color) {
        this.color = color;
    }

    @Override
    public String name() {
        return "T-Shirt";
    }

    @Override
    public String color() {
        return color == Color.RED ? "red" : "blue";
    }

    @Override
    public String productMaker() {
        return "\"Active Sports\"";
    }

    @Override
    public float price() {
        return DataHandler.priceHandler(color(), price);
    }

}

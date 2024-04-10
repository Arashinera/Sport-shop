package app;

public class Cap extends SmartCaps {

    float price = 5.49f;
    public enum Color {
        BLACK, WHITE
    }

    private final Color color;

    public Cap(Color color) {
        this.color = color;
    }

    @Override
    public String name() {
        return "Cap";
    }

    @Override
    public String color() {
        return color == Color.BLACK ? "black" : "white";
    }

    @Override
    public String productMaker() {
        return "\"Smart Caps\"";
    }

    @Override
    public float price() {
        return DataHandler.priceHandler(color(), price);
    }

}

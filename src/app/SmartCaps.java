package app;

public abstract class SmartCaps implements Item {

    @Override
    public abstract String name();

    @Override
    public abstract String color();

    @Override
    public abstract String productMaker();

    @Override
    public abstract float price();
}

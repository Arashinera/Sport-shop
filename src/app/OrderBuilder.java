package app;

public class OrderBuilder {

    public Order firstOrder() {
        Order order = new Order();
        order.addItem(new TShirt(TShirt.Color.RED));
        order.addItem(new Cap(Cap.Color.WHITE));
        return order;
    }

    public Order secondOrder() {
        Order order = new Order();
        order.addItem(new TShirt(TShirt.Color.BLUE));
        order.addItem(new Cap(Cap.Color.BLACK));
        return order;
    }

}

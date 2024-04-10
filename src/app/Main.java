package app;

public class Main {
    public static void main(String[] args) {

        OrderBuilder orderBuilder = new OrderBuilder();

        Order firstOrder = orderBuilder.firstOrder();
        System.out.println("\nFirst Order\n-------------");
        firstOrder.showItems();
        System.out.println("Order Total Cost : " + Constants.CURRENCY + DecimalUtil.rounderUtil(firstOrder.getCost()) + "\n-------------");

        Order secondOrder = orderBuilder.secondOrder();
        System.out.println("\nSecond Order\n-------------");
        secondOrder.showItems();
        System.out.println("Order Total Cost : " + Constants.CURRENCY + DecimalUtil.rounderUtil(secondOrder.getCost()) + "\n-------------");

    }
}

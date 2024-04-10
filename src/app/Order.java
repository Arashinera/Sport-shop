package app;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Item> clothes = new ArrayList<>();

    public void addItem(Item item) {
        clothes.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : clothes) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : clothes) {
            System.out.print("Item : " + item.name());
            System.out.print("\nProduct Maker : " + item.productMaker());
            System.out.print("\nColor : " + item.color());
            System.out.println("\nPrice : " + Constants.CURRENCY + item.price() + "\n");
        }
    }
}

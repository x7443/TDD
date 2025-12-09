 
import java.util.ArrayList;
import java.util.List;

import restaurangprojekt.Order;
 
public class KitchenScreen {
 
    private final List<Order> orders = new ArrayList<>();
 
    public void showOrder(Order order) {
        orders.add(order);
    }
 
    public boolean hasOrder(Order order) {
        return orders.contains(order);
    }
}
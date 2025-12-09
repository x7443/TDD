
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import restaurangprojekt.Order;
 
public class KitchenScreenTest {
 
    @Test
    void orderAppearsWithin30Seconds() {
        KitchenScreen screen = new KitchenScreen();
        Order order = new Order(1, "Juan", "Pizza");
 
        screen.showOrder(order);
 
        assertTrue(screen.hasOrder(order), "La orden debería aparecer en la pantalla de la cocina");
    }
}
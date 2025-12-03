
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import restaurangprojekt.Main;

public class MainTest {
    @Test 
    void testWelcomeMessage(){
        assertEquals(Main.welcomeMes, "Välkommen till 'restaurang namn'");

    }
    
}

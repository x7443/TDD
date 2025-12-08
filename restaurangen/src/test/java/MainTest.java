
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import restaurangprojekt.Order;
import restaurangprojekt.OrderLista;
import restaurangprojekt.TimeService;


public class MainTest {

    private TimeService mockTimeService;
   /* @Test 
    void testWelcomeMessage(){

        assertEquals(welcomeMensaje.welcomeMes, "Välkommen till PacoBurger, vad vill du beställa?");
    }*/ 

    @Test
    public void testNextOrderIncrement(){

        OrderLista listaManager = new OrderLista(mockTimeService);
        int primerOrderNum = listaManager.getNextOrderNummer();
        int segundoOrderNum = listaManager.getNextOrderNummer();
        assertEquals(1, primerOrderNum, "FAIL, el numero original (0) tiene que aumentarse a 1");
        assertEquals(primerOrderNum + 1, segundoOrderNum, "FAIL, el numero original (1) tiene que aumentarse a 2");
    }

    @Test
    public void testGuardadoDeDatos(){

        int numeroEsperado = 55;
        String idEsperado = "12";
        String comidaEsperada = "burger";

        Order nuevoPedido = new Order(numeroEsperado, idEsperado, comidaEsperada);

        assertEquals(numeroEsperado, nuevoPedido.getOrderNummer(), "El numero dado y el guardado no coinciden" );
        assertEquals(idEsperado, nuevoPedido.getKundID(), "El ID del cliente dado no coincide con el guardado");
        assertEquals("Ny", nuevoPedido.getOrderStatus());
    }
    @Test
    public void testPedidoStatus (){

        Order pedidoStatus = new Order(15, "John Doe", "Salad");
        assertEquals("Ny", Order.getOrderStatus(), "El estado inicial debe de ser 'Ny'");
        pedidoStatus.orderKlar();   
        assertEquals("Klar", Order.getOrderStatus(), "El estado debe ser 'Klar' después de llamar a markAsFinished()");
    }



    
}

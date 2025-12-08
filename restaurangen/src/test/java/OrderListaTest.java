import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import restaurangprojekt.OrderLista;
import restaurangprojekt.TimeService;

public class OrderListaTest {

    private TimeService mockTimeService;
    
    @BeforeEach
    public void setup(){

        OrderLista.reseteoDeContadorParaPruebas();
        mockTimeService = mock(TimeService.class);
    }

    @Test
    public void testNumeroDePedidoReset(){

        when(mockTimeService.getCurrentHour()).thenReturn(7);

        OrderLista filaAntesDeLas8 = new OrderLista(mockTimeService);
        
        for (int i = 0; i < 49 ; i++){
            
            filaAntesDeLas8.getNextOrderNummer();
        }

        assertEquals(50, filaAntesDeLas8.getNextOrderNummer());

        when(mockTimeService.getCurrentHour()).thenReturn(OrderLista.DAILY_RESET_HOUR);
        OrderLista filaALas8 = new OrderLista(mockTimeService);

        int primerNumeroDePedidoALas8 = filaALas8.getNextOrderNummer();
        assertEquals(1, primerNumeroDePedidoALas8, "La lista de pedidos no se ha reiniciado");
    }

}
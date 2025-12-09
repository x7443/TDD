package restaurangprojekt;


public class OrderLista {

   

    private static int currentOrderNumber = 0; 
    public static final int DAILY_RESET_HOUR = 8;
    public TimeService timeService; // Dependencia de tiempo

    public OrderLista(TimeService timeService) {
        this.timeService = timeService;
    }

    public int getNextOrderNummer() { 
        // Comprobar si es hora de abrir Y si el contador no ha sido reseteado ya
        if (timeService.getCurrentHour() == DAILY_RESET_HOUR && currentOrderNumber != 1) {
            currentOrderNumber = 1;
        } else {
            currentOrderNumber++; 
        }
         return currentOrderNumber;
    }

    // Método de ayuda estático para asegurar el aislamiento de las pruebas
    public static void reseteoDeContadorParaPruebas() {
        currentOrderNumber = 0;
    }
}

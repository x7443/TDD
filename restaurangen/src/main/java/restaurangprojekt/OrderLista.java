package restaurangprojekt;

public class OrderLista { 

    private static int currentOrderNummer = 0;

    public static int getNextOrderNummer(){

     currentOrderNummer++;
     return currentOrderNummer;

    }
    
}

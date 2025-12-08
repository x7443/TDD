package restaurangprojekt;
import java.util.Scanner;
import restaurangprojekt.TimeService;

public class Main {

    private static TimeService mockTimeService;

    public static void main(String[] args) {

        welcomeMensaje();

        Scanner scanner = new Scanner(System.in);
        OrderLista listHanterare = new OrderLista(mockTimeService);
        String orderedMat = scanner.nextLine();  
        System.out.println("Fyll i namn vid TakeAway eller bordsnummer vid dine-in");
        String ID = scanner.nextLine();
         
        int nextAvailableNummer = listHanterare.getNextOrderNummer();
        Order nyOrder = new Order(nextAvailableNummer, ID, orderedMat);

        System.out.println("\n" + "Tilldelat ordernummer: " + nyOrder.getOrderNummer());
        System.out.println("KundID: " + nyOrder.getKundID());
        System.out.println("Mat: " + nyOrder.getMat());
        System.out.println("Status: " + nyOrder.getOrderStatus());

        String kokStatus = scanner.nextLine();

        if(kokStatus.equalsIgnoreCase("S")){

            nyOrder.orderStartad();
            System.out.println("Order "+"'" + nyOrder.getKundID() + "' : " + nyOrder.getOrderStatus());
        } else {}

        kokStatus = scanner.nextLine();


        if(kokStatus.equalsIgnoreCase("F")){

            nyOrder.orderKlar();
            System.out.println("Order "+"'" + nyOrder.getKundID() + "' : " + nyOrder.getOrderStatus());
        }

    }

        public static void welcomeMensaje(){
        String welcomeMes = "Välkommen till PacoBurger, vad vill du beställa?";
        System.out.println(welcomeMes);

    }
}
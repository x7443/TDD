package restaurangprojekt;
import java.util.Scanner;

public class Main {

    public TimeService mockTimeService;

    public static void main(String[] args) {

        welcomeMensaje();
        Scanner scanner = new Scanner(System.in);
        TimeService timeService = new TimeService();
        OrderLista listHanterare = new OrderLista(timeService);
        String orderedMat = scanner.nextLine();  
        System.out.println("Fyll i namn vid TakeAway eller bordsnummer vid dine-in");
        String ID = scanner.nextLine();
         
        int nextAvailableNummer = listHanterare.getNextOrderNummer();
        Order nyOrder = new Order(nextAvailableNummer, ID, orderedMat);

        System.out.println("Tilldelat ordernummer: " + Order.getOrderNummer());
        System.out.println("KundID: " + Order.getKundID());
        System.out.println("Mat: " + Order.getMat());
        System.out.println("Status: " + Order.getOrderStatus());

        String kokStatus = scanner.nextLine();

        if(kokStatus.equalsIgnoreCase("S")){

            nyOrder.orderStartad();
            System.out.println("Order "+"'" + Order.getKundID() + "' : " + Order.getOrderStatus());
        } else {}

        kokStatus = scanner.nextLine();


        if(kokStatus.equalsIgnoreCase("F")){

            nyOrder.orderKlar();
            System.out.println("Order "+"'" + Order.getKundID() + "' : " + Order.getOrderStatus());

            scanner.close();
        }

    }

        public static void welcomeMensaje(){
        String welcomeMes = "Välkommen till PacoBurger, vad vill du beställa?";
        System.out.println(welcomeMes);

    }
}
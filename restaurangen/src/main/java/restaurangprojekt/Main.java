package restaurangprojekt;
import java.util.Scanner;

public class Main {
    public static String welcomeMes = "Välkommen till PacoBurger, vad vill du beställa?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderLista listHanterare = new OrderLista();
        System.out.println(welcomeMes);
        String orderedMat = scanner.nextLine();  
        System.out.println("Fyll i namn vid TakeAway eller bordsnummer vid dine-in");
        String ID = scanner.nextLine();
        int nextAvailableNummer = OrderLista.getNextOrderNummer();
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
}
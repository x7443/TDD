package restaurangprojekt;
import java.util.Scanner;

public class Main {

    public TimeService mockTimeService;

    public static void main(String[] args) {

        welcomeMensaje();
        try (Scanner scanner = new Scanner(System.in)) {
            TimeService timeService = new TimeService();
            OrderLista listHanterare = new OrderLista(timeService);
            String orderedMat = scanner.nextLine();
            System.out.println("Fyll i namn vid TakeAway eller bordsnummer vid dine-in");
            String ID = scanner.nextLine();
            
            int nextAvailableNummer = listHanterare.getNextOrderNummer();
            Order nyOrder = new Order(nextAvailableNummer, ID, orderedMat);
            
            System.out.println("\n____KÖKSKÄRMEN____");
            System.out.println("Orderstatus: *" + nyOrder.getOrderStatus() + "*");
            System.out.println("Ordernummer: " + nyOrder.getOrderNummer());
            System.out.println("Namn / bordsnummer: " + nyOrder.getKundID());
            System.out.println("Har beställt: " + nyOrder.getMat());
            System.out.println("\nTryck 'S' för att markera som startad. Övrig tangent för att avbryta order.");
            
            
            
            String kokStatus = scanner.nextLine();
            
            if(kokStatus.equalsIgnoreCase("S")){
                
                nyOrder.orderStartad();
                System.out.println("Order "+"'" + nyOrder.getKundID() + "' : " + nyOrder.getOrderStatus());
            } else {
                
                System.out.println("\nOrder avbruten");
                System.exit(0);
            }
            
            System.out.println("\nTryck på 'F' för att markera ordern som färdig. Övrig tangent för att avbryta den");
            kokStatus = scanner.nextLine();
            
            
            if(kokStatus.equalsIgnoreCase("F")){
                
                nyOrder.orderKlar();
                System.out.println("Order "+"'" + nyOrder.getKundID() + "' : " + nyOrder.getOrderStatus());
                
            } else {
                
                System.out.println("\nOrder avbruten");
                System.exit(0);
            }
        }


    }

        public static void welcomeMensaje(){
        String welcomeMes = "Välkommen till PacoBurger, vad vill du beställa?";
        System.out.println(welcomeMes);

    }
}
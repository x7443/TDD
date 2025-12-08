package restaurangprojekt;

public class Order {
    private static int orderNummer;
    private static String kundID;
    private static String mat;
    private static String status = "Ny";
    
    public Order(int nummer, String ID, String orderedMat){
        
        this.orderNummer = nummer;
        this.kundID = ID;
        this.mat = orderedMat;

    }



    public static int getOrderNummer(){
        return orderNummer;
    }

    public static String getMat(){
        return mat;
    }

    public static String getKundID(){
        return kundID;
    }
    
    public void orderStartad(){

        this.status = "Startad";
        System.out.println("*APP-NOTIS* Order " + orderNummer + "är startad");

    }

    public void orderKlar(){

        this.status = "Klar";
        System.out.println("*APP-NOTIS* Beställning nr " + orderNummer + " är färdig");

    }

    public static String getOrderStatus(){
        return status;
    }




    
}

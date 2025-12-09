package restaurangprojekt;

public class Order {
    private static int orderNummer;
    private static String kundID;
    private static String mat;
    private static String status = "Ny";
    
    public Order(int nummer, String ID, String orderedMat){
        
        Order.orderNummer = nummer;
        Order.kundID = ID;
        Order.mat = orderedMat;

    }



    public int getOrderNummer(){
        return orderNummer;
    }

    public String getMat(){
        return mat;
    }

    public String getKundID(){
        return kundID;
    }
    
    public void orderStartad(){

        Order.status = "Startad";
        System.out.println("*APP-NOTIS* Din order är startad! \nKÖKSSKÄRM:");

    }

    public void orderKlar(){

        Order.status = "Klar";
        System.out.println("*APP-NOTIS* Din order är klar! \nKÖKSSKÄRM:");

    }

    public String getOrderStatus(){
        return status;
    }




    
}

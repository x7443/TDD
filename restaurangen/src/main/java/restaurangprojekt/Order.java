package restaurangprojekt;

public class Order {
    private int orderNummer;
    private String kundID;
    private String mat;
    private String status = "Ny";
    
    public Order(int nummer, String ID, String orderedMat){
        
        this.orderNummer = nummer;
        this.kundID = ID;
        this.mat = orderedMat;

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

        this.status = "Startad";

    }

    public void orderKlar(){

        this.status = "Färdig";
        System.out.println("Beställning nr " + orderNummer + " är färdig");

    }

    public String getOrderStatus(){
        return status;
    }




    
}

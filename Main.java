package Pizza;

public class Main {
    public static void main(String args[]){



CusInt cus=new Customer("REGULAR",4);
RegPizInt rp=new RegPiz();
rp.setPrice(50);


Customer cus1=new Customer();
        PrmPiz pp=new PrmPiz(cus1);
        cus1.setPizzaTyp("premium");
        cus1.setSize(8);
        cus1.setPiece(3);
        cus1.setOrdId(235);
        pp.setPrice(80);


        if (cus.getPizzaTyp().equals("REGULAR")) {
            System.out.println(cus.getPizzaTyp());
            rp.ordPiz(cus.getSize());
            rp.addGou();
        }
        if(cus1.getPizzaTyp().equals("premium")) {
            System.out.println(cus1.getPizzaTyp());
            System.out.println(pp.getOrdId());
            pp.ordPiz(cus1.getSize(), cus1.getPiece());
            pp.addCru();
            pp.canPiz();






    }
}}

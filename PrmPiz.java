package Pizza;

public class PrmPiz extends Pizza implements PrmPizInt {

    public CusInt customer;

    PrmPiz(CusInt cust){
        this.customer=cust;
        setOrdId(customer.getOrdId());
    }

    public void addCru(){
        System.out.println("Groumet crust added");
    }
    @Override
    public void canPiz(){
        System.out.println("half of the amount only refundable");
    }



}


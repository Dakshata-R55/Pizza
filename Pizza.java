package Pizza;

public abstract class Pizza extends BaseFun implements PizzaInt {

    public void ordPiz(int size){
        int price =size*this.getPrice();
        System.out.println("pizza ordered");
        System.out.println("price :"+price);
    }
    public void ordPiz(int size,int extrapiece){
        int price =(size*this.getPrice()+((this.getPrice()/size)*extrapiece));
        System.out.println("pizza ordered");
        System.out.println("price :"+price);
    }


    public void canPiz(){
        System.out.println("pizza cancelled");
    }
}

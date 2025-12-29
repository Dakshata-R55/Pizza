package Pizza;

public class Customer extends BaseFun implements CusInt{

    private String pizzaTyp;
    private int size;
    private int piece;
Customer(String pizzaTyp,int size){
    this.setPizzaTyp("REGULAR");
    this.setSize(4);

}


Customer(){}
    public String getPizzaTyp() {
        return pizzaTyp;
    }

    public void setPizzaTyp(String pizzaTyp) {
        this.pizzaTyp = pizzaTyp;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }
}

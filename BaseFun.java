package Pizza;

public class BaseFun implements BaseIInt {
    private int ordId;
    private int price;

    public void setOrdId(int ordId) {
        this.ordId = ordId;
    }

    public int getOrdId() {
        return ordId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

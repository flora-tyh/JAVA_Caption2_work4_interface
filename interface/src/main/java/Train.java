public class Train implements Vehicle {

    private int price;

    public Train() {
    }

    public Train(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String useVehicle(int money) {
        if (money >= getPrice()) {
            return "可以选择火车";
        } else {
            return "不可以选择火车";
        }
    }
}

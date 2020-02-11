public class Bus implements Vehicle {

    private int price;

    public Bus(int price) {
        this.price = price;
    }

    public Bus() {
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
            return "可以选择大巴";
        } else {
            return "不可以选择大巴";
        }
    }
}
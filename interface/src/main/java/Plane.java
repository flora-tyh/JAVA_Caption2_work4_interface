public class Plane implements Vehicle {

    private int price;

    public Plane() {
    }

    public Plane(int price) {
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
            return "可以选择飞机";
        } else {
            return "不可以选择飞机";
        }
    }
}

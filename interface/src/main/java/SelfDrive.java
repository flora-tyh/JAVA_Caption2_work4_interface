public class SelfDrive implements Vehicle {

    private int price;

    public SelfDrive() {
    }

    public SelfDrive(int price) {
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
            return "可以选择自驾";
        } else {
            return "不可以选择自驾";
        }
    }
}

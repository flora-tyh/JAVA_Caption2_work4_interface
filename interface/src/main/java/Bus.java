public class Bus extends Vehicle implements UseVehicle {

    public Bus() {
    }

    public Bus(int price) {
        super(price);
    }

    @Override
    public String useVehicle() {
        return "可以选择大巴";
    }
}
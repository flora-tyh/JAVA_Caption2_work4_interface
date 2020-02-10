public class Train extends Vehicle implements UseVehicle {

    public Train() {
    }

    public Train(int price) {
        super(price);
    }

    @Override
    public String useVehicle() {
        return "可以选择火车";
    }
}

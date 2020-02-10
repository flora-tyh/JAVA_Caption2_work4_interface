public class Plane extends Vehicle implements UseVehicle {

    public Plane() {
    }

    public Plane(int price) {
        super(price);
    }

    @Override
    public String useVehicle() {
        return "可以选择飞机";
    }
}

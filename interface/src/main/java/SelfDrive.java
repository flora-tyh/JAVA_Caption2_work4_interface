public class SelfDrive extends Vehicle implements UseVehicle {

    public SelfDrive() {
    }

    public SelfDrive(int price) {
        super(price);
    }

    @Override
    public String useVehicle() {
        return "可以选择自驾";
    }
}

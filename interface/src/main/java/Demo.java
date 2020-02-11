public class Demo {
    public static void main(String[] args) {
        Passenger ming = new Passenger("小明", 300);
        Vehicle bus = new Bus(300);
        Vehicle selfDrive = new SelfDrive(500);
        Vehicle plane = new Plane(1000);
        Vehicle train = new Train(400);
        int money = ming.getMoney();

        System.out.println(bus.useVehicle(money));

        System.out.println(plane.useVehicle(money));

        System.out.println(selfDrive.useVehicle(money));

        System.out.println(train.useVehicle(money));

    }
}

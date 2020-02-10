public class Demo {
    public static void main(String[] args) {
        Passenger ming = new Passenger("小明", 300);
        Bus bus = new Bus(300);
        SelfDrive selfDrive = new SelfDrive(500);
        Plane plane = new Plane(1000);
        Train train = new Train(400);

        int money = ming.getMoney();

        if (money >= bus.getPrice()) {
            System.out.println(bus.useVehicle());
        }

        if (money >= plane.getPrice()) {
            System.out.println(plane.useVehicle());
        }

        if (money >= selfDrive.getPrice()) {
            System.out.println(selfDrive.useVehicle());
        }

        if (money >= train.getPrice()) {
            System.out.println(train.useVehicle());
        }
    }
}

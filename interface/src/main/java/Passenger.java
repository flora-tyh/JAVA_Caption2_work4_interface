public class Passenger {
    private String name;
    private int money;

    public Passenger(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public Passenger() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney() {
        this.money = money;
    }
}

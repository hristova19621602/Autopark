package bg.tu_varna.sit.car;

public abstract class Car implements Comparable {


    protected String name;
    protected String company;
    protected int speed;
    protected double fuelConsumption;
    protected int price;
    protected int doorsNumber;

    public Car(String newName, String newCompany, int newSpeed, double newFuel, int newPrice, int doors) {
        name = newName;
        company = newCompany;
        speed = newSpeed;
        fuelConsumption = newFuel;
        price = newPrice;
        doorsNumber = doors;
    }

    @Override
    public int compareTo(Object o) {
        Car c = (Car) o;
        return c.speed - this.speed;

    }

    @Override
    public String toString() {
        return name + ", company: " + company + ", speed: " + speed + ", fuelConsumption: " + fuelConsumption
                + ", price: " + price + ", doorsNumber:" + doorsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

}
package bg.tu_varna.sit.autopark;

import bg.tu_varna.sit.car.Car;
import java.util.List;
import java.util.ArrayList;

public class Autopark {

    private String name;
    private List<Car> cars;
    private int cost;

    public Autopark(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
        this.cost = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        List<Car> copyCars = new ArrayList<>();
        for(Car car:cars)
            copyCars.add(car);
        return copyCars;
    }

    public void addCar(Car car) {
        cars.add(car);
        cost += car.getPrice();
    }

    public Car getCar(int index) {
        if (cars.size() > index && index >= 0) {
            return cars.get(index);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int getCost() {
        return cost;
    }

    private List<Car> mergeBySpeed(List<Car> carA, List<Car> carB) {
        int i, j;
        List<Car> carRes = new ArrayList<>();
        for (i = 0, j = 0; i < carA.size(); i++) {
            while (j < carB.size() && carB.get(j).compareTo(carA.get(i)) > 0) {
                carRes.add(carB.get(j++));
            }
            carRes.add(carA.get(i));
        }
        while (j < carB.size()) {
            carRes.add(carB.get(j++));
        }
        return carRes;
    }

    public List<Car> mergeSortBySpeed(int first, int last) {
        if (last == first) {
            List<Car> car = new ArrayList<>();
            car.add(cars.get(first));
            return car;
        }

        int middle = (last + first) / 2;
        List<Car> carA = mergeSortBySpeed(first, middle);
        List<Car> carB = mergeSortBySpeed(middle + 1, last);
        List<Car> carRes = mergeBySpeed(carA, carB);
        return carRes;
    }

    public void sortBySpeed() {
        cars = mergeSortBySpeed(0, cars.size() - 1);
    }

    public List<Car> findCarsByCompanyAndSpeed(String ofCompany, int speedMin, int speedMax) {
        List<Car> list = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCompany().equals(ofCompany) && car.getSpeed() >= speedMin
                    && car.getSpeed() <= speedMax) {
                list.add(car);
            }
        }
        return list;
    }

    public void print() {
        System.out.println(name + " Autopark");
        for (Car car : cars) {
            System.out.println("    " + car.toString());
        }
    }
}

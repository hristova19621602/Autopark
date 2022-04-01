package bg.tu_varna.sit;

import bg.tu_varna.sit.car.Car;
import bg.tu_varna.sit.autopark.Autopark;
import bg.tu_varna.sit.car.Coupe;
import java.util.List;
import bg.tu_varna.sit.car.Cabriolet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Autopark: ");
        Autopark autopark = new Autopark("Tatiana19621602");
        autopark.addCar(new Coupe("A1", "Mercedes", 380, 3.6, 88000, true));
        autopark.addCar(new Coupe("A2", "BMW", 330, 3.8, 50000, false));
        autopark.addCar(new Cabriolet("A3", "BMW", 360, 1.5, 55000, "soft"));
        autopark.print();

        System.out.println("\nSort autopark cars by speed: ");
        autopark.sortBySpeed();
        autopark.print();

        System.out.println("\nFind auto of the company that are in given range of speed.");
        List<Car> found = autopark.findCarsByCompanyAndSpeed("BMW", 300, 400);
        for (Car car : found) {
            System.out.println(car.toString());
        }

        System.out.println("\nCount autopark cost: ");
        System.out.println(autopark.getCost());


    }




    }


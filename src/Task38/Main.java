package Task38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите машину котрую хотите загнать в  гараж машин");
        Scanner scanner = new Scanner(System.in);
        Car car = new Car(scanner.next());
        Garage<Car> garageCar = new Garage<>();
        garageCar.setCar(car);
        System.out.println(garageCar.getCar().name + " в гараже машин ");

        System.out.println("Выберите мотоцикл котрый хотите загнать в  гараж мотоциклов");
        Motorcycle motorcycle = new Motorcycle(scanner.next());
        Garage<Motorcycle> garageMotorcycle = new Garage<>();
        garageMotorcycle.setMotorcycle(motorcycle);
        System.out.println(garageMotorcycle.getMotorcycle().name + " в гараже мотоциклов ");

        System.out.println("Выберите машину  которую хотите загнать в  гараж транспорта");
        Car car1 = new Car(scanner.next());
        System.out.println("Выберите мотоцикл котрый хотите загнать в  гараж мотоциклов");
        Motorcycle motorcycle1 = new Motorcycle(scanner.next());
        Garage<Vehicle> garageVehicle = new Garage<>();
        garageVehicle.setCar(car1);
        garageVehicle.setMotorcycle(motorcycle1);
        System.out.println(garageVehicle.getCar().name + " и " + garageVehicle.getMotorcycle().name + " в гараже транспорта ");


    }


}

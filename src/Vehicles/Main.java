package Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] first = scanner.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(first[1]), Double.parseDouble(first[2]));
        String[] second = scanner.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(second[1]), Double.parseDouble(second[2]));

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String type = tokens[1];

            if (command.equals("Drive")) {
                double km = Double.parseDouble(tokens[2]);
                if (type.equals("Car")) {
                    car.drive(km);
                } else {
                    truck.drive(km);
                }
            } else {
                double liters = Double.parseDouble(tokens[2]);
                if (type.equals("Car")) {
                    car.refuel(liters);
                } else {
                    truck.refuel(liters);
                }
            }
        }

        System.out.println(car);
        System.out.println(truck);

    }
}
package Vehicles;

import java.text.DecimalFormat;

public class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumption;


    protected Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    protected void drive(double km) {
        if (km * fuelConsumption <= fuelQuantity) {
            fuelQuantity -= km * fuelConsumption;
            DecimalFormat decimalFormat = new DecimalFormat("##.##");
            System.out.printf("%s travelled %s km", getClass().getSimpleName(), decimalFormat.format(km));
            System.out.println();
        } else {
            System.out.printf("%s needs refueling", getClass().getSimpleName());
            System.out.println();
        }
    }

    protected void refuel(double liters) {
        if (getClass().getSimpleName().equals("Car")) {
            fuelQuantity += liters;
        } else {
            fuelQuantity += 0.95 * liters;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), fuelQuantity);
    }
}

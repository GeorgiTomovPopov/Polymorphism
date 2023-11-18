package Vehicles;

public class Truck extends Vehicle{
    protected Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 1.6);
    }
}

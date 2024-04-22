
import Vehicle.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravisharma
 */
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(vehicle1);
        Vehicle vehicle2 = VehicleFactory.getVehicleObject("Car");
        printVehicleDetails(vehicle2);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Tank Capacity: " + vehicle.getTankCapacity());
    }
}

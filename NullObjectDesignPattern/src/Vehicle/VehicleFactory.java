/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

/**
 *
 * @author ravisharma
 */
public class VehicleFactory {
    public static Vehicle getVehicleObject(String typeOfVehicle){
        if (typeOfVehicle.equals("Car")){
            return new Car();
        }
        return new NullObject();
    }
}

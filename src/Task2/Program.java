package Task2;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<String> groundVehicles = new ArrayList<>();
        ArrayList<String> flyingVehicles = new ArrayList<>();
        ArrayList<String> waterVehicles = new ArrayList<>();

        GroundVehicle car = new Car(4, "Opel");
        GroundVehicle motorcycle = new Motorcycle(2, 200);
        GroundVehicle bus = new Bus(50,"Warsaw - Kyiv");
        FlyingVehicle helicopter = new Helicopter(4,400, 10);
        FlyingVehicle plane = new Plane(100,800);
        WaterVehicle boat = new Boat(10,200);
        WaterVehicle liner = new Liner(400, 5);

        groundVehicles.add(String.valueOf(car));
        groundVehicles.add(String.valueOf(motorcycle));
        groundVehicles.add(String.valueOf(bus));

        flyingVehicles.add(String.valueOf(helicopter));
        flyingVehicles.add(String.valueOf(plane));

        waterVehicles.add(String.valueOf(boat));
        waterVehicles.add(String.valueOf(liner));
    }
}

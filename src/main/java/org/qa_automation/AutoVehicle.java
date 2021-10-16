package org.qa_automation;

public class AutoVehicle extends Vehicle {

    private Engine engine;
    private double mileage;
    private double fuelLevel;

    public AutoVehicle(Engine engine){
        this.engine = engine;
        System.out.println("AutoVehicle constructor");
    }

    public AutoVehicle(Engine engine, String name){
        this.engine = engine;
        setName(name);
    }

    public AutoVehicle(){}

    public Engine getEngine() {
        return engine;
    }

    public Engine getEngine(String name){
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }


    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public double accelerate(double speed) {
        setCurrentSpeed(getCurrentSpeed() + speed);
        double travelledDistance = getCurrentSpeed() * 60;
        double spentFuel = travelledDistance * mileage /100;
        fuelLevel -= spentFuel;
        return travelledDistance;

    }
}

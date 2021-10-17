package org.qa_automation;

public class Vehicle {

    public static final String CONTROL_TYPE = "Radio control";
    private String name;
    private String color;
    private int wheelCount;
    private double currentSpeed;
    private Engine engine;
    private double mileage;
    private double fuelLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelCount(){
        return wheelCount;
    }

    public void setWheelCount(int wheelCount){
        this.wheelCount=wheelCount;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String toString(){
        return "name: " + name + ", color: " +  color + ", wheel number:  " + wheelCount;
    }

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

    public double accelerate(double speed) {
        if(fuelLevel > 0) {
            setCurrentSpeed(getCurrentSpeed() + speed);
            double travelledDistance = getCurrentSpeed() * 60;
            double spentFuel = travelledDistance * mileage / 100;
            fuelLevel -= spentFuel;
            return travelledDistance;
        } else {
            System.out.println("Vehicle " + name + " is out of fuel");
            return 0;
        }

    }
}

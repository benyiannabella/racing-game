package org.qa_automation;

public class Vehicle {

    public static final String CONTROL_TYPE = "Radio control";
    private String name;
    private String color;
    private int wheelCount;
    private double currentSpeed;

    //display the made distance per 1 minute
    public double accelerate(double speed) {
        currentSpeed += speed;
        return currentSpeed * 60;
    }

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
}

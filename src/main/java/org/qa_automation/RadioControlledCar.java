package org.qa_automation;

public class RadioControlledCar extends AutoVehicle {

    private int doorCount;

    public RadioControlledCar(Engine engine) {
        super(engine);
//        System.out.println("RadioControlledCar constructor");
    }

    public void checkRadioResponse(){

    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}

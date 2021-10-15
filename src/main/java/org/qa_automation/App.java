package org.qa_automation;

public class App {
    public static void main( String[] args ) {

        Race race = new Race();
        Engine engine = new Engine();
        RadioControlledCar dacia = new RadioControlledCar(engine);
        dacia.setName("dacia");
        dacia.setColor("red");
        dacia.setDoorCount(4);
        dacia.setWheelCount(4);
        dacia.setMileage(8.5);

        Engine engine1 = new Engine();
        engine.setManufacturer("Renault");
        dacia.setEngine(engine1);

        RadioControlledCar lada = new RadioControlledCar(engine);
        lada.setName("lada");
        lada.setColor("blue");
        lada.setDoorCount(2);
        lada.setWheelCount(4);
        lada.setMileage(8);

        Engine ladaEngine = new Engine();
        lada.setEngine(ladaEngine);

        race.setFirstCar(dacia);
        race.setSecondCar(lada);

        double test = dacia.accelerate(8.1);
        System.out.println(test);
    }
}

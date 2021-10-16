package org.qa_automation;

public class App {
    public static void main(String[] args) {


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

//        Race race = new Race(dacia, lada, new Vehicle());
//        race.setFirstCar(dacia);
//        race.setSecondCar(lada);

//        double test = dacia.accelerate(8.1);
//        System.out.println(test);

//        System.out.println(dacia.getName());
//        System.out.println(lada.getName());
//        System.out.println(RadioControlledCar.CONTROL_TYPE);
//        System.out.println(dacia.CONTROL_TYPE);
//        System.out.println(lada.CONTROL_TYPE);

//        System.out.println("______________________________________");

//        dacia.CONTROL_TYPE = "Improved controller";

//        System.out.println(RadioControlledCar.CONTROL_TYPE);
//        System.out.println(dacia.CONTROL_TYPE);
//        System.out.println(lada.CONTROL_TYPE);

//        constructors  overload
//        new AutoVehicle();
//        new AutoVehicle(new Engine());
//        new AutoVehicle(new Engine(), "name");

//        System.out.println(dacia.toString());

//        Vehicle car = new RadioControlledCar(new Engine());
//        car being a vehicle cannot call RadioControlledCar methods
//        car.checkRadioResponse();
//        dacia having reference type RadioControlledCar can call method
//        dacia.checkRadioResponse();

//        RadioControlledMotorcycle motorcycle = new RadioControlledMotorcycle(new Engine());
        Race newRace = new Race();
//        newRace.insertCompetitor2(dacia);
//        newRace.insertCompetitor2(lada);

//        for(int i = 0; i<newRace.getCompetitors().length; i++) {
//            if (newRace.getCompetitors()[i] != null) {
//                System.out.println(newRace.getCompetitors()[i].getName());
//            }
//        }
//
//        for (int i = 0; i < newRace.getCompetitorsList().size(); i++) {
//            System.out.println(newRace.getCompetitorsList().get(i).getName());
//        }
//
//        for (Vehicle vehicle : newRace.getCompetitorsList()) {
//            System.out.println(vehicle.getName());
//        }
//
//        newRace.getCompetitorsList().remove(dacia);
//        System.out.println(newRace.getCompetitorsList().size());

        newRace.readVehicleName();
        newRace.accelerationSpeed();
    }

}

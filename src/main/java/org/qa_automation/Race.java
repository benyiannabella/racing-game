package org.qa_automation;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Race {

//    private Vehicle[] competitors = new Vehicle[10];
    private List<Vehicle> competitorsList = new ArrayList<>();
    private double trackLength;
    private double trackFuelLevel;
    private int competitorCount = 2;

    public double getTrackFuelLevel() {
        return trackFuelLevel;
    }

    public void setTrackFuelLevel(double trackFuelLevel) {
        this.trackFuelLevel = trackFuelLevel;
    }

    public double getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(double trackLength) {
        this.trackLength = trackLength;
    }

    public Race (){
    }
//    public Race(Vehicle... competitors){
//        this.competitors = competitors;
//    }
    public List<Vehicle> getCompetitorsList(){
        return competitorsList;
    }

//    public void insertCompetitor(int index, Vehicle vehicle){
//        competitors[index]=vehicle;
//    }

    public void insertCompetitor2(Vehicle vehicle){
        competitorsList.add(vehicle);
    }

    public String readVehicleName(){
        System.out.println("Please type the name of your vehicle: ");
        Scanner scanner = new Scanner(System.in);
        String vehicleName = scanner.nextLine();
        System.out.println("Your vehicle name is " + vehicleName);
        return vehicleName;
    }

    public double accelerationSpeed() {
        System.out.println("Please enter speed as a decimal number: ");
        Scanner scanner = new Scanner(System.in);
        double speed=0;
        try {
            speed = scanner.nextDouble();
            System.out.println("The speed you've enter is: " + speed + "km/h");

        } catch (InputMismatchException exception){
            System.out.println("Please enter a valid number");
            accelerationSpeed();
        }

        return speed;
    }

    public void addCompetitor(){
        String name = readVehicleName();
        AutoVehicle autoVehicle = new AutoVehicle();
        autoVehicle.setName(name);

        double mileage= ThreadLocalRandom.current().nextDouble(8,11);
        autoVehicle.setMileage(mileage);
        System.out.println("Mileage for vehicle wih name: " + autoVehicle.getName() + ", " + mileage + "l/100" );
        competitorsList.add(autoVehicle);
    }

    public  void addAllCompetitors(){
        for(int i = 0; i < competitorCount; i++){
            addCompetitor();
        }
    }


    public Vehicle returnWinner() {
        int noFuelCompetitors = 0;
        boolean noWinnerYet = true;

        while (noFuelCompetitors < competitorCount) {
            for (Vehicle vehicle : competitorsList) {
                double accelerationSpeed = accelerationSpeed();
                double travelDistance = vehicle.accelerate(accelerationSpeed);

                if (vehicle.getFuelLevel() <= 0) {
                    noFuelCompetitors++;
                }

                if (travelDistance >= trackLength) {
                    System.out.println("The winner of the race is : " + vehicle.getName());
                    return vehicle;
                }
            }
        }
        return null;
    }

    public void start(){
        addAllCompetitors();
        returnWinner();
    }

}

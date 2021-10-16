package org.qa_automation;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Race {

//    private Vehicle[] competitors = new Vehicle[10];
    private List<Vehicle> competitorsList = new ArrayList<>();

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


}

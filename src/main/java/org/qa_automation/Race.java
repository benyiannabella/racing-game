package org.qa_automation;

import java.util.ArrayList;
import java.util.List;

public class Race {

//    private Vehicle[] competitors = new Vehicle[10];
    private List<Vehicle> competitorsList = new ArrayList<Vehicle>();

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


}

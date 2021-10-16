package org.qa_automation;

public class Race {

    private Vehicle[] competitors = new Vehicle[10];

    public Race (){
    }
    public Race(Vehicle... competitors){
        this.competitors = competitors;
    }
    public Vehicle[] getCompetitors(){
        return competitors;
    }

    public void insertCompetitor(int index, Vehicle vehicle){
        competitors[index]=vehicle;
    }
}

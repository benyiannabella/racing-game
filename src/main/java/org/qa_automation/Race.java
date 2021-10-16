package org.qa_automation;

public class Race {

    private Vehicle firstCompetitor;
    private Vehicle secondCompetitor;

    public Race(Vehicle firstCompetitor, Vehicle secondCompetitor){
        this.firstCompetitor = firstCompetitor;
        this.secondCompetitor = secondCompetitor;
    }
    public Vehicle getFirstCompetitor() {
        return firstCompetitor;
    }

    public void setFirstCompetitor(Vehicle firstCompetitor) {
        this.firstCompetitor = firstCompetitor;
    }

    public Vehicle getSecondCompetitor() {
        return secondCompetitor;
    }

    public void setSecondCompetitor(Vehicle secondCompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}

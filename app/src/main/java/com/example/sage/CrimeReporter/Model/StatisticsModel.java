package com.example.sage.CrimeReporter.Model;

public class StatisticsModel {
    private String firstName, LastName, noOfCrime, location;

    public StatisticsModel() {
    }

    public StatisticsModel(String firstName, String lastName, String noOfCrime,
                           String location) {
        this.firstName = firstName;
        LastName = lastName;
        this.noOfCrime = noOfCrime;
        this.location = location;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getNoOfCrime() {
        return noOfCrime;
    }

    public void setNoOfCrime(String noOfCrime) {
        this.noOfCrime = noOfCrime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

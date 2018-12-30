package com.example.sage.CrimeReporter.Model;

/**
 * Created by iduma on 3/28/18.
 */

public class ReportingModel {
    private String uid, ReporterName, crimeSceneCordinates, noOfCrime;

    public ReportingModel() {
    }

    public ReportingModel(String uid, String ReporterName, String crimeSceneCordinates, String typeOfTrees, String noOfCrime) {
        this.uid = uid;
        this.ReporterName = ReporterName;
        this.crimeSceneCordinates = crimeSceneCordinates;
        this.noOfCrime = noOfCrime;

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getReporterName() {
        return ReporterName;
    }

    public void setReporterName(String reporterName) {
        this.ReporterName = reporterName;
    }

    public String getCrimeSceneCordinates() {
        return crimeSceneCordinates;
    }

    public void setCrimeSceneCordinates(String crimeSceneCordinates) {
        this.crimeSceneCordinates = crimeSceneCordinates;
    }



    public String getNoOfCrime() {
        return noOfCrime;
    }

    public void setNoOfCrime(String noOfCrime) {
        this.noOfCrime = noOfCrime;
    }
}

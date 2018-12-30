package com.example.sage.CrimeReporter.Model;

public class ReportModel {

    private String reporterName, crimeSceneCoordinates, crimeDescrip;

    public ReportModel() {
    }

    public ReportModel(String reporterName, String crimeSceneCoordinates,
                       String crimeDescrip) {
        this.reporterName = reporterName;
        this.crimeSceneCoordinates = crimeSceneCoordinates;
        this.crimeDescrip = crimeDescrip;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getCrimeSceneCoordinates() {
        return crimeSceneCoordinates;
    }

    public void setCrimeSceneCoordinates(String crimeSceneCoordinates) {
        this.crimeSceneCoordinates = crimeSceneCoordinates;
    }


    public String getCrimeDescrip() {
        return crimeDescrip;
    }

    public void setCrimeDescrip(String crimeDescrip) {
        this.crimeDescrip = crimeDescrip;
    }
}

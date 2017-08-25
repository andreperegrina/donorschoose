package com.donorschoose.model;

public class Project {
    private String title;
    private String shortDescription;
    private String proposalURL;
    private double costToComplete;
    private double percentFunded;
    private int numDonors;
    private int numStudents;
    private double totalPrice;


    public double getCostToComplete() {
        return costToComplete;
    }

    public double getPercentFunded() {
        return percentFunded;
    }

    public int getNumDonors() {
        return numDonors;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Project: \n" +
                "\n  Title: '" + title +
                "\n  Short Description: '" + shortDescription +
                "\n  Proposal URL: '" + proposalURL +
                "\n  Cost To Complete: " + costToComplete;
    }
}

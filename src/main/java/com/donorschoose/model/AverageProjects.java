package com.donorschoose.model;

public class AverageProjects {

    int numberProjects = 0;
    private double percentFundedTotal = 0;
    private double numberDonorsTotal = 0;
    private double costToCompleteTotal = 0;
    private double numberStudentsTotal = 0;
    private double totalPriceTotal = 0;

    public double getPercentFundedTotal() {
        return percentFundedTotal;
    }

    public double getNumberDonorsTotal() {
        return numberDonorsTotal;
    }

    public double getCostToCompleteTotal() {
        return costToCompleteTotal;
    }

    public double getNumberStudentsTotal() {
        return numberStudentsTotal;
    }

    public double getTotalPriceTotal() {
        return totalPriceTotal;
    }

    public void addPercentFundedTotal(double percentFundedTotal) {
        this.percentFundedTotal += percentFundedTotal;
    }

    public void addNumberDonorsTotal(double numberDonorsTotal) {
        this.numberDonorsTotal += numberDonorsTotal;
    }

    public void addCostToCompleteTotal(double costToCompleteTotal) {
        this.costToCompleteTotal += costToCompleteTotal;
    }

    public void addNumberStudentsTotal(double numberStudentsTotal) {
        this.numberStudentsTotal += numberStudentsTotal;
    }

    public void addTotalPriceTotal(double totalPriceTotal) {
        this.totalPriceTotal += totalPriceTotal;
    }

    public void setNumberProjects(int numberProjects) {
        this.numberProjects = numberProjects;
    }

    public double calculatePercentFundedTotalAverage() {
        return percentFundedTotal / numberProjects;
    }

    public double calculateNumberDonorsTotalAverage() {
        return numberDonorsTotal / numberProjects;
    }

    public double calculateCostToCompleteTotalAverage() {
        return costToCompleteTotal / numberProjects;
    }

    public double calculateNumberStudentsTotalAverage() {
        return numberStudentsTotal / numberProjects;
    }

    public double calculateTotalPriceTotalAverage() {
        return totalPriceTotal / numberProjects;
    }

    @Override
    public String toString() {
        return "Average: " +
                "\n  Percent found= " + calculatePercentFundedTotalAverage() +
                "\n  Number donors= " + calculateNumberDonorsTotalAverage() +
                "\n  Cost to complete= " + calculateCostToCompleteTotalAverage() +
                "\n  Number students= " + calculateNumberStudentsTotalAverage() +
                "\n  Total price= " + calculateTotalPriceTotalAverage();
    }
}

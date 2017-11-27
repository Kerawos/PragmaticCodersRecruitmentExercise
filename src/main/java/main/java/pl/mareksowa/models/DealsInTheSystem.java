package main.java.pl.mareksowa.models;

public class DealsInTheSystem {

    private String dealDate;
    private double price;
    private double netPrice;
    private double exchangeRate;
    private int agentId;

    public DealsInTheSystem() {
    }

    public DealsInTheSystem(String dealDate, double price, double netPrice, double exchangeRate, int agentId) {
        this.dealDate = dealDate;
        this.price = price;
        this.netPrice = netPrice;
        this.exchangeRate = exchangeRate;
        this.agentId = agentId;
    }

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }
}

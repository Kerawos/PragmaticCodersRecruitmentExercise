package main.java.pl.mareksowa.models;

public class Agent {
    private int id;
    private String name;
    private String currency;
    private String country;

    public Agent() {
    }

    public Agent(int id, String name, String currency, String country) {
        this.id = id;
        this.name = name;
        this.currency = currency;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

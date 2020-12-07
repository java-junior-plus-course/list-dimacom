package edu.junior.person;

public class Address {

    private String county;
    private String city;
    private String street;
    private String apartment;

    public Address(String county, String city, String street, String apartment) {
        this.county = county;
        this.city = city;
        this.street = street;
        this.apartment = apartment;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}

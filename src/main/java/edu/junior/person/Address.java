package edu.junior.person;

import java.util.Objects;

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
    public Address(Address address) {
        this(address.getCounty(), address.getCity(), address.getStreet(), address.getApartment());
    }
    @Override
    public String toString() {
        return String.format("address : %s %s,%s %s  ", county, city, street, apartment);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(county, address.county) &&
                Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(apartment, address.apartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(county, city, street, apartment);
    }
}

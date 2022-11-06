package com.example.JPADesign.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String addressLineOne;
    private String addressLineTwo;
    private String apartmentNumber;
    private String city;
    private String state;
    private String zip;
    private String zipFour;
    private String county;
    private String country;

    protected Address() {
    }

    public Address(String addressLineOne, String addressLineTwo, String apartmentNumber, String city, String state, String zip, String zipFour, String county, String country) {
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.zipFour = zipFour;
        this.county = county;
        this.country = country;
    }

    public String toString() {
        return String.format("Address[id=%d, addressLineOne='%s, addressLineTwo='%s, apartmentNumber='%s, city='%s, state='%s, zip='%s, zipFour='%s,county='%s, country='%s]", id, addressLineOne, addressLineTwo, apartmentNumber, city, state, zip, zipFour, county, country);
    }

    public Long getId() {
        return id;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getZipFour() {
        return zipFour;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }

}

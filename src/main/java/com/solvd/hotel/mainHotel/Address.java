package com.solvd.hotel.mainHotel;

import java.util.Objects;
import java.lang.String;
import java.util.Arrays;

import com.solvd.hotel.enums.City;

public abstract class Address {
    private String nameCountry;
    private City city;
    private String address;

    public Address() {

    }

    public Address(String nameCountry, City city, String address) {
        this.nameCountry = nameCountry;
        this.city = city;
        this.address = address;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[nameCountry=" + getNameCountry() + ", city=" + getCity() + ", address=" + getAddress() + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameCountry().hashCode(), getCity().hashCode(), getAddress().hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return hashCode() == address.hashCode();
    }
}
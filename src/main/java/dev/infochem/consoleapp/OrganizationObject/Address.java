package dev.infochem.consoleapp.OrganizationObject;

public class Address {

    private String zipCode; //Длина строки не должна быть больше 19, поле может быть null
    public Address(String zipCode) {
        this.zipCode = zipCode;
    }
    public boolean isValidZipCode() {
        return zipCode.length() <= 19;
    }
    }

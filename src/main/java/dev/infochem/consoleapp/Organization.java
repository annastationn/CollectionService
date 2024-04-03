package dev.infochem.consoleapp;

import dev.infochem.consoleapp.OrganizationObject.Address;
import dev.infochem.consoleapp.OrganizationObject.Coordinates;
import dev.infochem.consoleapp.OrganizationObject.OrganizationType;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Objects;
public class Organization {
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private float annualTurnover; //Значение поля должно быть больше 0
    private OrganizationType type; //Поле может быть null
    private Address officialAddress; //Поле не может быть null

    public Organization (int id, String name, Coordinates coordinates, java.time.ZonedDateTime creationDate, float annualTurnover, OrganizationType type, Address officialAddress) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.annualTurnover = annualTurnover;
        this.type = type;
        this.officialAddress = officialAddress;
    }


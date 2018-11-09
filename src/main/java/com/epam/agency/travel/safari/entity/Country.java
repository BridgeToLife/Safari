package com.epam.agency.travel.safari.entity;

import com.epam.agency.travel.safari.entity.api.Identifible;

public class Country implements Identifible {

    private long id;
    private String name;

    public Country(long id, String name){
        this.id = id;
        this.name = name;
    }

}

package com.company.BigProject;

import java.io.Serializable;

public class Cities_BP implements Serializable {
    Long id;
    String name;
    String country;
    String shortName;

    Cities_BP(){}

    public Cities_BP(Long id, String name, String shortName) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
    }

    public Cities_BP(Long id, String name, String country, String shortName) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.shortName = shortName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getShort_name() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}

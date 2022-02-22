package com.company.BigProject;
import java.io.Serializable;

public class Tickets_BP implements Serializable {
    Long id;
    Long flight_id;
    String name;
    String surname;
    String passport_number;
    String ticket_type; //ec - ecnom class, bc - business class
    String strflightName;

    public Tickets_BP() {
    }

    public Tickets_BP(Long id, Long flight_id, String name, String surname, String passport_number, String ticket_type, String strflightName) {
        this.id = id;
        this.flight_id = flight_id;
        this.name = name;
        this.surname = surname;
        this.passport_number = passport_number;
        this.ticket_type = ticket_type;
        this.strflightName = strflightName;
    }

    public Tickets_BP(Long id, Long flight_id, String name, String surname, String passport_number, String ticket_type) {
        this.id = id;
        this.flight_id = flight_id;
        this.name = name;
        this.surname = surname;
        this.passport_number = passport_number;
        this.ticket_type = ticket_type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Long flight_id) {
        this.flight_id = flight_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }

    public String getTicket_type() {
        return ticket_type;
    }

    public void setTicket_type(String ticket_type) {
        this.ticket_type = ticket_type;
    }

    public String getStrflightName() {
        return strflightName;
    }

    public void setStrflightName(String strflightName) {
        this.strflightName = strflightName;
    }
}
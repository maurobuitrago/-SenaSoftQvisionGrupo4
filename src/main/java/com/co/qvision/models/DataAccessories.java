package com.co.qvision.models;

public class DataAccessories {


    private String identification;
    private String password;
    private String name;
    private String lastname;
    private String numidentify;
    private String email;
    private String telephone;
    private String direction;
    private String code;

    public DataAccessories(String identification, String password, String name, String lastname, String numidentify, String email, String telephone, String direction, String code) {
        this.identification = identification;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.numidentify = numidentify;
        this.email = email;
        this.telephone = telephone;
        this.direction = direction;
        this.code = code;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNumidentify() {
        return numidentify;
    }

    public void setNumidentify(String numidentify) {
        this.numidentify = numidentify;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

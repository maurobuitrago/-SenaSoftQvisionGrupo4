package com.co.qvision.models;

public class DataRegister {

    private String identification;
    private String email;
    private String password;

    public DataRegister(String identification, String email, String password) {
        this.identification = identification;
        this.email = email;
        this.password = password;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

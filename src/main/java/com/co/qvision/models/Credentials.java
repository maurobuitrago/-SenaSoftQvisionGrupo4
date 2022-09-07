package com.co.qvision.models;


public class Credentials {


    //Variables identification y password que harán relevancia a los datos que se usaran de la WebTable del archivo login.feature
    private String identification;
    private String password;

    //Constructor publico que permite instanciar la clase Credentials en otras clases
    public Credentials(String identification, String password) {
        this.identification = identification;
        this.password = password;
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
}
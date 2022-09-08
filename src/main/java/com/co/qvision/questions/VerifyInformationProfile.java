package com.co.qvision.questions;

import com.co.qvision.tasks.NavigateProfileInstagram;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyInformationProfile implements Question {

    public static VerifyInformationProfile inThePage(){
        return new VerifyInformationProfile();
    }

    //Retornamos el valor del UrlIG que se encuentra en NavigateProfileInstagram
    @Override
    public String answeredBy(Actor actor) {
        return NavigateProfileInstagram.UrlIG;
    }
}

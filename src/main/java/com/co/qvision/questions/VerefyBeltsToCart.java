package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.qvision.userinterfaces.HandbagPage.TXT_VERIFYITEM3;

public class VerefyBeltsToCart implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_VERIFYITEM3).viewedBy(actor).asString();
    }
}

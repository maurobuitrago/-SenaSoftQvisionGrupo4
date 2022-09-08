package com.co.qvision.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/shoes.feature",
        glue = "com/co/qvision/stepsdefinitions",
        tags = {"@AddShoesToCard"}

)
public class ShoesRunner {
}

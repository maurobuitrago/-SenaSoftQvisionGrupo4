package com.co.qvision.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/handbag.feature",
        glue = "com/co/qvision/stepsdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = {"@AddWishList"}
)
public class HandbagRunner {
}

package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\features\\mercurytours.feature",
tags="@test",
glue="stepdefs"
)



public class MercuryToursRunner {

}

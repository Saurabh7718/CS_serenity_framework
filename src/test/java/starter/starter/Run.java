package starter.starter;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    plugin = {"pretty"},
    features = "C:\\Users\\Lenovo\\eclipse-workspace\\X_Practice_serenity_cucumber_bdd\\src\\test\\resource\\features",
    glue = "starter.stepdefinitions", // Check this package path
    dryRun = false,
    monochrome =  true,
    tags=" @practice1"
)
public class Run {
}

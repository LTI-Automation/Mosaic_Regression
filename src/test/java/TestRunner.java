

import cucumber.api.java.Before;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.testng.annotations.BeforeTest;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/",
        //tags = {"@login"},
        glue="classpath:stepDefinations",
        monochrome= true, //dryRun = true,
        plugin="html:target/cucumber-report")

public class TestRunner {

    @BeforeTest
    public void abc(){

    }



}

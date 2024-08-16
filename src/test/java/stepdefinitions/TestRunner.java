package StepDefinitons;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/LoginDemo.feature", glue = {"stepdefinitions"})

public class TestRunner {
    public static void main(String[] args) {
        System.out.println("Test Runner");
    }
}

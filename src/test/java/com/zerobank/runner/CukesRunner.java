package com.zerobank.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/zerobank/step_definitions",
        tags = "@savings_select",
        dryRun = true,
        publish = false


)

public class CukesRunner {
}

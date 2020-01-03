package com.odooBrightERP.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/activities", //we will modify here
                    "src/test/resources/features/fleet"},
        glue = "com/odooBrightERP/step_definitions",
        dryRun = false,
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)

public class RegressionRunner {
}

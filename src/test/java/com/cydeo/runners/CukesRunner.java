package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { //the name of the report file that report type and  where to store
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"//"PrettyReports" prints out additional information about the scenario
                //this plugin generates the "MAVEN CUCUMBER REPORTING
        },
        features = "src/test/resources/features",   //path of the features directory
        glue = "com/cydeo/step_definitions",   //path to step_def
        dryRun = false,   //execute step_def or not. we can change it true to get snippets only and then again we change it false!
        tags = "@wip", //it control to which scenario is run @work in progress
        publish = true

)

public class CukesRunner {
}

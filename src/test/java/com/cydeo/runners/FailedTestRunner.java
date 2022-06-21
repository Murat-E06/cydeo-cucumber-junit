package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/cydeo/step_definitions",   //path to step_def
        features="@target/rerun.txt" //bu runner class target folderdaki rerun file dosyasına bakıyor
        //When we run it, it will execute the "failed" scenarios that are stored in the rerun.txt

)

public class FailedTestRunner {

}

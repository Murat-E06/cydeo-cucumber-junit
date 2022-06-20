package com.cydeo.step_definitions;

//In the class we will bw able to pass pre- & post- conditions to
//each scenario and each step

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before(order = 1)//import from io.cucumber.java not from junit!!
    public void setupScenario() {
        System.out.println("====Setting up browser using cucumber @Before");
    }

    @Before(value = "@login", order = 2)// login.future 1. satıra @login ilave ettikten sonra burayı ilave ettik
    public void setupScenarioForLogins() {
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    @Before(value = "@db", order = -0)//"db" den önce v=value ,den sonra o=order kısayol)
    public void setupForDatabaseScenarios() {
        System.out.println("====this will only apply to scenarios with @db tag");
    }

    @After
    public void teardownScenario(Scenario scenario) {

        //if scenario.isFailed()-->if scenario fails this method will return True boolean value
        if(scenario.isFailed()){//senaryoda hata varsa screenshot ını alıyoruz developer a göstermek için!!
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //downcasting is here in order to take and store a screenshot to byte array

            scenario.attach(screenshot, "image/png", scenario.getName());

        }





        Driver.closeDriver();

        //  System.out.println("====Closing browser using cucumber @After");
        //  System.out.println("====Scenario ended/ Take screenshot if failed");
    }

    @BeforeStep
    public void setupStep() {
        System.out.println("------>applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("------->applying teardown using @AfterStep");
    }


}

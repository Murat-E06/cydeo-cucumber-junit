package com.cydeo.step_definitions;

//In the class we will bw able to pass pre- & post- conditions to
//each scenario and each step

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before (order = 1)//import from io.cucumber.java not from junit!!
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }

    @Before (value = "@login",order = 2)// login.future 1. satıra @login ilave ettikten sonra burayı ilave ettik
    public void setupScenarioForLogins(){
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    @Before (value = "@db",order = -0)//"db" den önce v=value ,den sonra o=order kısayol)
    public void setupForDatabaseScenarios(){
        System.out.println("====this will only apply to scenarios with @db tag");
    }

    @After
    public void teardownScenario(){
        System.out.println("====Closing browser using cucumber @After");
        System.out.println("====Scenario ended/ Take screenshot if failed");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("------>applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("------->applying teardown using @AfterStep");
    }



}

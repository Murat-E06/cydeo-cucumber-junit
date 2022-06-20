package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebTable_StepDefinitions {

    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url= ConfigurationReader.getProperty("webTableUrl");
        Driver.getDriver().get(url);
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTableLoginPage.inputUsername.sendKeys(string);

    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        webTableLoginPage.loginButton.click();

    }
    @Then("user should url contains orders")
    public void user_should_url_contains_orders() {
        BrowserUtils.verifyURLContains("orders");//BrowserUtils de yeni metod oluşturduk burada ppphemencik çağırdık

    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String pw) {//pw:password
      // webTableLoginPage.inputUsername.sendKeys(username);
     //  webTableLoginPage.inputPassword.sendKeys(pw);
     //  webTableLoginPage.loginButton.click();

        webTableLoginPage.login(username,pw);//yukarıdakiler yerine webTableLoginPage deki bu metodu yazdık(String, String) olanı 3 tane çıkıyor

    }
}

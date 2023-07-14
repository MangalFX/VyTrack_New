package com.cydeo.step_definitions;

import com.cydeo.pages.Login_Page;
import com.cydeo.utilites.ConfigReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_StepDefinitions {





    @When("user enters the {string} information")
    public void user_enters_the_information(String DriverUsername) {


    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {

        WebDriverWait wait = new WebDriverWait (Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.titleIs("Dashboard"));

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(expectedTitle,actualTitle);

    }
}

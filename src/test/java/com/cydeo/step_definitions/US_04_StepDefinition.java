package com.cydeo.step_definitions;

import com.cydeo.pages.US_04_Page;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_04_StepDefinition {

    US_04_Page us04Page = new US_04_Page();


    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {

    }
    @When("users click the “Learn how to use this space”")
    public void users_click_the_learn_how_to_use_this_space() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        us04Page.learnSpaceLink.click();

    }
    @Then("users should see header {string}")
    public void users_should_see_header(String expectedHeaderText) {

    }
    @Then("users should see {string}")
    public void users_should_see(String expectedText) {

    }
    @Then("users should see an image on the page image source {string}")
    public void users_should_see_an_image_on_the_page_image_source(String expectedImageSource) {

    }

}
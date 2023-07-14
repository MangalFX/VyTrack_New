package com.cydeo.step_definitions;

import com.cydeo.pages.Login_Page;
import com.cydeo.utilites.ConfigReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Hook {





    @Before(order = 1)
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigReader.getProperty("env1"));
        Login_Page loginPage = new Login_Page();
        loginPage.login(ConfigReader.getProperty("sales_manager"),ConfigReader.getProperty("password"));
    }





}
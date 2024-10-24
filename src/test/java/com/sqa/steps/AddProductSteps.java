package com.sqa.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductSteps {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("add_product");
    }

    @Given("user in sanangel web")
    public void userInSanangelWeb() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://sanangel.com.co/"));
    }

    @When("add two products at cart")
    public void addTwoProductsAtCart() {
    }

    @And("One product with two items")
    public void oneProductWithTwoItems() {
    }

    @And("Two product with five items")
    public void twoProductWithFiveItems() {
    }

    @Then("the cart has products")
    public void theCartHasProducts() {
    }


}

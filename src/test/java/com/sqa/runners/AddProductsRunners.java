package com.sqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/add_productsadd_products.feature",
glue = "com.sqa.steps",
snippets = CucumberOptions.SnippetType.CAMELCASE)
public class AddProductsRunners {
}
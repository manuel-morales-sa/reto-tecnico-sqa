package com.sqa.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddProductsUi {

    public static final Target FIRST_ELEMENT = Target.the("first_element").
            locatedBy("/html/body/div[2]/main/article/div/section[1]/div/div/div/div/div/div/div[2]/div/div[1]/div[2]/div/ul/li[1]/a/h2");

    public static final Target SELECT_DATE = Target.the("select_date").
            locatedBy("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[1]");

    public static final Target SELECT_TIME = Target.the("select_time").
            locatedBy("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[2]/a[2]");

    public static final Target SELECT_QUANTITY = Target.the("select_quantity").
            located(By.id("quantity_671ab2ce0fd26"));

    public static final Target ADD_TO_CART = Target.the("add_to_cart").
            locatedBy("/html/body/div[2]/main/div[2]/div/div[2]/form/div/div/div[2]/button");

    public static final Target GO_BACK_HOME = Target.the("go_back_home").
            locatedBy("/html/body/div[1]/header/div[2]/div/a/img");

    public static final Target SECOND_ELEMENT = Target.the("second_element").
            locatedBy("/html/body/div[2]/main/article/div/section[1]/div/div/div/div/div/div/div[2]/div/div[1]/div[2]/div/ul/li[2]/a[2]/h2");
}

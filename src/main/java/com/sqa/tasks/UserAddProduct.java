package com.sqa.tasks;

import com.sqa.ui.AddProductsUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserAddProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddProductsUi.FIRST_ELEMENT),
                Click.on(AddProductsUi.SELECT_DATE),
                Click.on(AddProductsUi.SELECT_TIME),
                SendKeys.of("2").into(AddProductsUi.SELECT_QUANTITY),
                Click.on(AddProductsUi.ADD_TO_CART),
                Click.on(AddProductsUi.GO_BACK_HOME),
                Click.on(AddProductsUi.SECOND_ELEMENT),
                Click.on(AddProductsUi.SELECT_DATE),
                Click.on(AddProductsUi.SELECT_TIME),
                SendKeys.of("5").into(AddProductsUi.SELECT_QUANTITY),
                Click.on(AddProductsUi.ADD_TO_CART)
        );
    }

    public static UserAddProduct makeinformation() {
        return instrumented(UserAddProduct.class);
    }
}

package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.CartPage;
import userinterfaces.HomePage;
import userinterfaces.NL1520Page;
import userinterfaces.Sg6Page;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


public class BuyProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_PRODUCT_SG6));
        actor.attemptsTo(Click.on(Sg6Page.BTN_ADDTOCART_SG6));
        actor.attemptsTo(
                WaitUntil.the(Sg6Page.BTN_HOME, isPresent()).forNoMoreThan(10).seconds()
        );
        //actor.attemptsTo(Switch.toAlert().andAccept());
        actor.attemptsTo(Click.on(Sg6Page.BTN_HOME));
        actor.attemptsTo(Click.on(HomePage.BTN_PRODUCT_NL1520));
        actor.attemptsTo(Click.on(NL1520Page.BTN_ADDTOCART_SG6));
        actor.attemptsTo(
                WaitUntil.the(NL1520Page.BTN_CART, isPresent()).forNoMoreThan(10).seconds()
        );
        actor.attemptsTo(Click.on(NL1520Page.BTN_CART));
        actor.attemptsTo(Click.on(CartPage.BTN_PLACEORDER));
        actor.attemptsTo(Enter.theValue("Actor").into(CartPage.TXT_NAME));
        actor.attemptsTo(Enter.theValue("Ecuador").into(CartPage.TXT_COUNTRY));
        actor.attemptsTo(Enter.theValue("Guayaquil").into(CartPage.TXT_CITY));
        actor.attemptsTo(Enter.theValue("0123456789").into(CartPage.TXT_CREDITCARD));
        actor.attemptsTo(Enter.theValue("12").into(CartPage.TXT_MONTH));
        actor.attemptsTo(Enter.theValue("2023").into(CartPage.TXT_YEAR));
        actor.attemptsTo(Click.on(CartPage.BTN_PURCHASE));
        actor.attemptsTo(
                WaitUntil.the(CartPage.BTN_OK, isPresent()).forNoMoreThan(3).seconds()
        );
        actor.attemptsTo(Click.on(CartPage.BTN_OK));
        actor.attemptsTo(
                WaitUntil.the(HomePage.TXT_CATEGORIES, isPresent()).forNoMoreThan(3).seconds()
        );
    }

    public static BuyProduct enterandadd(){
        return Tasks.instrumented(BuyProduct.class);
    }

}

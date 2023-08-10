package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NL1520Page {
    public static final Target BTN_ADDTOCART_SG6 = Target.the("Add to Cart Button").locatedBy("//a[contains(text(),'Add to cart')]");
    public static final Target BTN_CART = Target.the("Button that leads to the cart page").locatedBy("//a[@id='cartur']");
}

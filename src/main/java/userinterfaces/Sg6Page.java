package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Sg6Page {
    public static final Target BTN_ADDTOCART_SG6 = Target.the("Add to Cart Button").locatedBy("//a[contains(text(),'Add to cart')]");
    public static final Target BTN_HOME = Target.the("HOME Button").locatedBy("//li[@class='nav-item active']//a[@class='nav-link']");
}

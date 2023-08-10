package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target BTN_PRODUCT_SG6 = Target.the("Product link that leads to product single page").locatedBy("//a[contains(text(),'Samsung galaxy s6')]");
    public static final Target BTN_PRODUCT_NL1520 = Target.the("Product link that leads to product single page").locatedBy("//a[contains(text(),'Nokia lumia 1520')]");
    public static final Target TXT_CATEGORIESTEXT = Target.the("Title of the categories side menu").locatedBy("//*[text()='CATEGORIES']");
    public static final Target TXT_CATEGORIES = Target.the("Title of the categories side menu").locatedBy("//a[@id='cat']");
}

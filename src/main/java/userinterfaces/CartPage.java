package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target BTN_PLACEORDER = Target.the("Button to place the order").locatedBy("//button[contains(text(),'Place Order')]");
    public static final Target TXT_NAME = Target.the("Input that expects a name in string").locatedBy("//input[@id='name']");
    public static final Target TXT_COUNTRY = Target.the("Input that expects a country in string").locatedBy("//input[@id='country']");
    public static final Target TXT_CITY = Target.the("Input that expects a city in string").locatedBy("//input[@id='city']");
    public static final Target TXT_CREDITCARD = Target.the("Input that expects a card in number").locatedBy("//input[@id='card']");
    public static final Target TXT_MONTH = Target.the("Input that expects a month in number").locatedBy("//input[@id='month']");
    public static final Target TXT_YEAR = Target.the("Input that expects a year in number").locatedBy("//input[@id='year']");
    public static final Target BTN_PURCHASE = Target.the("Button that submits the purchase").locatedBy("//button[contains(text(),'Purchase')]");
    public static final Target BTN_OK = Target.the("Button that accepts the confirmation of your successful purchase").locatedBy("//button[contains(text(),'OK')]");
    //public static final Target TXT_CONFIRMATION = Target.the("Text in pop up that confirms a successful purchase").locatedBy("//h2[contains(text(),'Thank you for your purchase!')]");
}

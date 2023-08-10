package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.HomePage;

public class CompareCategories implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomePage.TXT_CATEGORIESTEXT).asString().answeredBy(actor);
    }

    public static CompareCategories validation() {
        return new CompareCategories();
    }
}

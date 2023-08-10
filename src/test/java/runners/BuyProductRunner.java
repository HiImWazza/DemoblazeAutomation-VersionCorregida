package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( // Para organizar las configureaciones.. donde ejecuta los escenarios y donde los pega
        features = "src/test/resources/features/buyproduct.feature", // De donde saca los escenarios
        snippets = CucumberOptions.SnippetType.CAMELCASE, // Como quiero que me cree los escenarios/métodos...quita los espacios en blancos de las condiciones del escenario, y pone en mayúscula la primera palabara de la condición
        glue = "stepsdefinitions" // Donde pega los escenarios... el paquete de "StepsDefinitions"
)
public class BuyProductRunner {
}

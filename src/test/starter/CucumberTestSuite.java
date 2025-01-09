package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.actor.OnStage;
import net.serenitybdd.screenplay.actor.OnlineCast;
import org.junit.BeforeClass;
import org.junit.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "starter.stepdefinations"
        //,tags = "@" //Agregar la etiqueta del test que se quiere probar
)

public class CucumberTestSuite {
    @BeforeClass
    public static void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }
}
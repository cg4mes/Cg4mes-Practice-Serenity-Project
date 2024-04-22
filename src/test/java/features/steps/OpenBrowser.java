package features.steps;

import abilities.UseBrowser;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static screenplay.actors.Hooks.environment;

public class OpenBrowser {
    @Dado("actor quien desea abrir el navegador")
    public void openBrowser(){
        theActorCalled("Actor")
                .attemptsTo(
                        UseBrowser.getBaseUrl()
                );
    }

    @Cuando("use el webDriver")
    public void useWebDriver(){

    }
    @Entonces("pueda visualizar la apertura del navegador")
    public void viewBrowser(){

    }
}

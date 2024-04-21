package features.steps;

import abilities.OpenBrowserWeb;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class OpenBrowser {
    @Dado("actor quien desea abrir chrome")
    public void openBrowser(){
        theActorCalled("Actor").attemptsTo(
                OpenBrowserWeb.get()
        );
    }
    @Cuando("use el webDriver")
    public void useWebDriver(){

    }
    @Entonces("pueda visualizar la apertura del navegador")
    public void viewBrowser(){

    }
}

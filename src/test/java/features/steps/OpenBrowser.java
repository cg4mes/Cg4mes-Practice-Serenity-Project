package features.steps;

import abilities.UseBrowser;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class OpenBrowser {
    @Dado("actor quien desea abrir chrome en su pc")
    public void openBrowserWeb(){
        theActorCalled("Actor").attemptsTo(
                UseBrowser.get()
        );
    }
    @Dado("actor quien desea abrir chrome en su telefono")
    public void openBrowserMobile(){
        OnStage.theActorCalled("actorName")
                .describedAs("ActorDescription");
    }
    @Cuando("use el webDriver")
    public void useWebDriver(){

    }
    @Entonces("pueda visualizar la apertura del navegador")
    public void viewBrowser(){

    }
}

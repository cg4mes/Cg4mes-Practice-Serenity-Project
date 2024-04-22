package screenplay.actors;

import abilities.UsePhone;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import net.thucydides.model.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

public class MobileCast extends Cast {
    public final EnvironmentVariables environmentVariables;

    public MobileCast(EnvironmentVariables environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    @Override
    public Actor actorNamed(String actorName, Ability... abilities) {
        return super.actorNamed(actorName, UsePhone.with(theDefaultDriverFor(actorName)));
    }


    private WebDriver theDefaultDriverFor(String actorName) {
        return ThucydidesWebDriverSupport.getWebdriverManager().getWebdriverByName(actorName);
    }
}

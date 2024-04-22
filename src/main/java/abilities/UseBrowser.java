package abilities;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.configuration.SystemPropertiesConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UseBrowser implements Task {

    public static UseBrowser get(){
        return instrumented(UseBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SystemPropertiesConfiguration configuration = new SystemPropertiesConfiguration(SystemEnvironmentVariables.createEnvironmentVariables());
        EnvironmentVariables environmentVariables = configuration.getEnvironmentVariables();
        String url = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("url");
        actor.attemptsTo(Open.url(url));
    }
}

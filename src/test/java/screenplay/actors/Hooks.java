package screenplay.actors;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.Serenity;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.model.util.EnvironmentVariables;

public class Hooks {
    private EnvironmentVariables environmentVariables;
    public static String environment;
    @Before
    public void setUp(Scenario scenario){

        try{
            environment = System.getProperty("environment");
        }catch (RuntimeException e){
            environment = System.getProperty("environments");
        }
        if(environment.contains("mobile")){
            OnStage.setTheStage(new MobileCast(environmentVariables));
        }else if(environment.contains("web")){
            OnStage.setTheStage(new OnlineCast());
        }else{
            System.err.println("Environment not found!");
        }
        Serenity.setSessionVariable("ScenarioName").to(scenario.getName());
    }
}

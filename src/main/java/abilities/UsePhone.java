package abilities;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class UsePhone extends BrowseTheWeb {

    protected UsePhone(WebDriver browser) {super(browser);}

    public static UsePhone with(WebDriver driver){
        return new UsePhone(driver);
    }
}

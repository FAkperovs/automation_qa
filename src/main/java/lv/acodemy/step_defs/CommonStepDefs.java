package lv.acodemy.step_defs;

import io.cucumber.java.en.Given;
import lv.acodemy.utiles.DriverManager;
import org.openqa.selenium.WebDriver;

public class CommonStepDefs {

    private final WebDriver driver = DriverManager.getInstance();

    @Given("user opens {string}")
    public void userOpenUrl(String url) {
        driver.get(url);
    }

}

package lv.acodemy.hooks;

import io.cucumber.java.After;
import lv.acodemy.utiles.DriverManager;

public class Hooks {

    @After
    public void tearDown() {
        DriverManager.closeDriver();
    }

}

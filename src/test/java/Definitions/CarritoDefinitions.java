package Definitions;

import PageObjects.MenuPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CarritoDefinitions {
    MenuPage menu;

    public CarritoDefinitions() {
        menu = new MenuPage(Hooks.driver);
    }

    @Given("la pagina esta estable")
    public void laPaginaEstaEstable() {

        Hooks.driver.get("http://demo.guru99.com/payment-gateway/index.php");
    }

    @When("doy click en generar tarjeta")
    public void doyClickEnGenerarTarjeta() {
        menu.clickGenerarTarjeta();
    }
}

package Definitions;

import PageObjects.CapturarDatosTarjetaPage;
import PageObjects.MenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CarritoDefinitions {
    MenuPage menu;
    CapturarDatosTarjetaPage captura;

    public CarritoDefinitions() {
        menu = new MenuPage(Hooks.driver);
        captura = new CapturarDatosTarjetaPage(Hooks.driver);
    }

    @Given("la pagina esta estable")
    public void laPaginaEstaEstable() {

        Hooks.driver.get("http://demo.guru99.com/payment-gateway/index.php");
    }

    @When("doy click en generar tarjeta")
    public void doyClickEnGenerarTarjeta() {
        menu.clickGenerarTarjeta();
    }

    @And("capturamos datos de la tarjeta")                      //Definition
    public void capturamosDatosDeLaTarjeta() {
        captura.CambiarVentana();
        captura.CapturarTarjeta();
    }

    @And("capturamos el cvv de la tarjeta")                     //Definition
    public void capturamosElCvvDeLaTarjeta() {
        captura.CapturarCVV();
        
    }

    @And("capturamos la fecha de la tarjeta")                   //Definition
    public void capturamosLaFechaDeLaTarjeta() {
        captura.CapturarFecha();
        
    }

    @And("capturamos el monto disponible de la tarjeta")        //Definition
    public void capturamosElMontoDisponibleDeLaTarjeta() {
        captura.CapturarMonto();
        captura.CerrarVenta();
    }
}

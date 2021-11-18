package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy (linkText = "Generate Card Number") private WebElement lnk_generarTarjeta;  //Generador ///


    public MenuPage(WebDriver d) {
        driver = d;
        wait = new WebDriverWait(driver,30); //30 segundos de espera
        PageFactory.initElements(driver,this);
    }

    public void clickGenerarTarjeta(){
        //Espera que cargue la pagina con el wait
        wait.until(ExpectedConditions.elementToBeClickable(lnk_generarTarjeta));
        lnk_generarTarjeta.click();
    }
}

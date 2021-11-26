package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckCreditPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name = "card_nmuber") private WebElement txt_cardNumber;  //Generador
    @FindBy(name = "submit") private WebElement btn_submit;


    public CheckCreditPage(WebDriver d) {      //Constructor
        driver = d;
        wait = new WebDriverWait(driver,30); //30 segundos de espera
        PageFactory.initElements(driver,this);
    }
    public void IngresarDatoTarjeta(){
        wait.until(ExpectedConditions.visibilityOf(txt_cardNumber));
        txt_cardNumber.sendKeys(CapturarDatosTarjetaPage.tarjeta);
    }

    public void ClickBtn (){
        btn_submit.click();
    }

}
